# googlecodelabsexercises

![Build](https://github.com/AwesomeJim/Google-CodeLabs-Exercises/workflows/Pre%20Merge%20Checks/badge.svg)

This is your new Kotlin Android Project! Happy hacking!

## Template ToDo list 👣

- [x] Create a new template project.
- [x] Choose a [LICENSE](https://github.com/AwesomeJim/Google-CodeLabs-Exercises/community/license/new?branch=master).
- [x] Code some cool apps and libraries 🚀.

## Features 🎨

- **100% Kotlin-only template**.
- 3 Sample modules (Android app, Android library, Kotlin library).
- Sample Espresso, Instrumentation & JUnit tests.
- 100% Gradle Kotlin DSL setup.
- CI Setup with GitHub Actions.
- Publish to **Maven Central** with Github Actions.
- Dependency versions managed via `buildSrc`.
- Kotlin Static Analysis via `ktlint` and `detekt`.
- Issues Template (bug report + feature request).
- Pull Request Template.

## Gradle Setup 🐘

This template is using [**Gradle Kotlin DSL**](https://docs.gradle.org/current/userguide/kotlin_dsl.html) as well as the [Plugin DSL](https://docs.gradle.org/current/userguide/plugins.html#sec:plugins_block) to setup the build.

Dependencies are centralized inside the [Dependencies.kt](buildSrc/src/main/java/Dependencies.kt) file in the `buildSrc` folder. This provides convenient auto-completion when writing your gradle files.

## Static Analysis 🔍

This template is using [**ktlint**](https://github.com/pinterest/ktlint) with the [ktlint-gradle](https://github.com/jlleitschuh/ktlint-gradle) plugin to format your code. To reformat all the source code as well as the buildscript you can run the `ktlintFormat` gradle task.

This template is also using [**detekt**](https://github.com/detekt/detekt) to analyze the source code, with the configuration that is stored in the [detekt.yml](config/detekt/detekt.yml) file (the file has been generated with the `detektGenerateConfig` task).

## CI ⚙️

This template is using [**GitHub Actions**](https://github.com/cortinico/kotlin-android-template/actions) as CI. You don't need to setup any external service and you should have a running CI once you start using this template.

There are currently the following workflows available:
- [Validate Gradle Wrapper](.github/workflows/gradle-wrapper-validation.yml) - Will check that the gradle wrapper has a valid checksum
- [Pre Merge Checks](.github/workflows/pre-merge.yaml) - Will run the `build`, `check` and `publishToMavenLocal` tasks.
- [Publish Snapshot](.github/workflows/publish-snapshot.yaml) - Will publish a `-SNAPSHOT` of the libraries to Sonatype.
- [Publish Release](.github/workflows/publish-release.yaml) - Will publish a new release version of the libraries to Maven Central on tag pushes.


