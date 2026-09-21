
kotlin {
    jvmToolchain(27)
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}
