
kotlin {
    # renovate: datasource=java-version depName=java
    jvmToolchain(17)
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}
