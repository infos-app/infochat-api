tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}
dependencies {
    implementation(project(":storage:rdb"))
    runtimeOnly(project(":core"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}