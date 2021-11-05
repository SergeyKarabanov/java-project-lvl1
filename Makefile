.DEFAULT_GOAL := build-run

setup:
	gradle wrapper --gradle-version 7.2
clean:
	./gradlew clean
build:
	./gradlew clean build
install:
	./gradlew clean install
run-dist:
	./build/install/java-project-lvl1/bin/java-project-lvl1
run:
	./gradlew run
test:
	./gradlew test
lint:
	./gradlew checkstyleMain checkstyleTest
check-updates:
	./gradlew dependencyUpdates
build-run: build run
.PHONY: build