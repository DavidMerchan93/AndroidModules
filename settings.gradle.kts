pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AndroidModules"
include(":app")
include(":core")
include(":onboarding")
include(":tracker")
include(":onboarding:onbording_presentation")
include(":onboarding:onboarding_domain")
include(":tracker:tracker_presentation")
include(":tracker:tracker_data")
include(":tracker:tracker_domain")
include(":core-ui")
