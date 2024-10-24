plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "T4_ObjetosKotlin"
include("src:main:kotlin")
findProject(":src:main:kotlin")?.name = "kotlin"
