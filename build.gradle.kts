plugins {
    kotlin("jvm") version "2.1.0"
}

group = "com.codergm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("commons-logging:commons-logging:1.3.5")
    testImplementation("org.assertj:assertj-core:3.25.3")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}