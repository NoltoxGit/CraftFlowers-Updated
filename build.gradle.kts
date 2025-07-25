plugins {
    java
    id("com.gradleup.shadow") version "9.0.0-rc1"
    id("xyz.jpenilla.run-paper") version "2.3.1"
}

group = "at.toastiii.craftflowers"
version = "1.2.6-SNAPSHOT-v1"

repositories {
    mavenCentral()
    maven(url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/"))
    maven(url = uri("https://maven.enginehub.org/repo/"))
    maven(url = uri("https://libraries.minecraft.net"))

}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.21.8-R0.1-SNAPSHOT")
    compileOnly("com.mojang:authlib:3.11.50")
    compileOnly("com.fastasyncworldedit:FastAsyncWorldEdit-Bukkit:2.13.0")
    implementation("fr.minuskube.inv:smart-invs:1.2.7") {
        isTransitive = false
    }
}

tasks.withType<ProcessResources> {
    filesMatching("plugin.yml") {
        expand(mapOf("version" to project.version))
    }
}

tasks {
    shadowJar {
        relocate("fr.minuskube.inv", "cm.ptks.craftflowers.smartinvs")
    }
    build {
        dependsOn(shadowJar)
    }
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(21)
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name()
    }
}

tasks {
    runServer {
        minecraftVersion("1.21.8")
    }
}
