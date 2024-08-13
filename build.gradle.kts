plugins {
    kotlin("jvm") version "2.0.10"
    `java-test-fixtures`
}

//dependencyLocking {
//    lockAllConfigurations()
//    lockMode.set(LockMode.STRICT)
//}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testFixturesImplementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")
}

kotlin {
    jvmToolchain(21)
}