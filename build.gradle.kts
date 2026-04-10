
kotlin {
    jvmToolchain(26)
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}
