Jenkins Shared Library
======================

Usage
-----

1. [on Jenkins setting] "Manage Jenkins" -> "Configure System" -> "Global Pipeline Libraries" -> "Add" -> Add folowing sample input:
	- Name: test-library
	- Default version: master (for master branch)
	- Mark: Include @Library changes in job recent changes
	- Modern SCM and put this GitHub repo url
	- Add "Discover branches"
2. [on Jenkins pipeline] Just add ```@test-library``` to start to use it.

Source
------

The whole documentation can be found [here](https://www.jenkins.io/doc/book/pipeline/shared-libraries/)
