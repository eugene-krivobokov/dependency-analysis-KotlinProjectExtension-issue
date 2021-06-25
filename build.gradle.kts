plugins {
    id("com.autonomousapps.dependency-analysis") version "0.74.0"
}

subprojects {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}
