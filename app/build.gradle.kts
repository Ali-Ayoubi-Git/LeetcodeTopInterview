
plugins {
    kotlin("jvm")
    application

}
kotlin {
    jvmToolchain(17)
}


repositories {
    mavenCentral()
    maven {
        url = uri("https://company/com/maven2")
    }
    mavenLocal()
    flatDir {
        dirs("libs")
    }
}



application {
    mainClass = "org.example.app.AppKt"
}





