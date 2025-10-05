
kotlin {
    # renovate: datasource=docker depName=jdk
    jvmToolchain(17)
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}
