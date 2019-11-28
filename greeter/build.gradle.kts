plugins {
    application
}

application {
    mainClassName = "greeter.Greeter"
}

dependencies {
    implementation(project(":greeting-library"))
}