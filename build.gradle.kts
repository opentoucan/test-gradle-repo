
kotlin {
    # renovate: datasource=java-version depName=jdk
    jvmToolchain(17)
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}
