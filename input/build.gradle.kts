plugins {
    application
    java
}

group = "com.open592"
version = "1.0-SNAPSHOT"

object InputConstants {
    const val MAIN_CLASS = "com.open592.input.Input"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

application {
    mainClass.set(InputConstants.MAIN_CLASS)
}

java {
    withSourcesJar()
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = InputConstants.MAIN_CLASS
    }
}