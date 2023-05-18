SHELL := bash
.ONESHELL:
.SHELLFLAGS := -eu -o pipefail -c
.DELETE_ON_ERROR:
MAKEFLAGS += --warn-undefined-variables
MAKEFLAGS += --no-builtin-rules

.PHONY: help start_services grade test run

# help: @ Lists available make tasks
help:
	@egrep -oh '[0-9a-zA-Z_\.\-]+:.*?@ .*' $(MAKEFILE_LIST) | \
	awk 'BEGIN {FS = ":.*?@ "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}' | sort

# clean: @ Clean the build
clean:
	mvn clean

# grade: @ Grade a specific scenario (usage: `make grade SCENARIO=Login`)
grade: SUBMISSION_DIR ?= ${PWD}
grade: GRADE_CMD ?= 'mvn test'
grade:
	@echo +++ Command -- $(GRADE_CMD)
	@echo +++ Date -- $(shell date)

	@echo +++ Running grading tests

	pushd "$(SUBMISSION_DIR)"
	export GRADE_CMD=$(GRADE_CMD)
	export SUBMISSION_DIR="$(SUBMISSION_DIR)"
	docker-compose -f docker-compose.grading.yml run grader
	popd
	@echo +++ Date -- $(shell date)
