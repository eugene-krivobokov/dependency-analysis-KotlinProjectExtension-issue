# dependency-analysis-KotlinProjectExtension-issue

Reproducer for KotlinProjectExtension issue in dependency analysis plugin:

```sh
./gradlew :library:projectHealth
```

```txt
Caused by: java.lang.TypeNotPresentException: Type org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension not present
        at org.gradle.api.reflect.TypeOf.captureTypeArgument(TypeOf.java:291)
        at org.gradle.api.reflect.TypeOf.<init>(TypeOf.java:97)
        at com.autonomousapps.DependencyAnalysisPlugin$configureKotlinJvmProject$1$$special$$inlined$the$1.<init>(TypeOfExtensions.kt:28)
        at com.autonomousapps.DependencyAnalysisPlugin$configureKotlinJvmProject$1.execute(DependencyAnalysisPlugin.kt:1076)
        at com.autonomousapps.DependencyAnalysisPlugin$configureKotlinJvmProject$1.execute(DependencyAnalysisPlugin.kt:58)
```

https://github.com/autonomousapps/dependency-analysis-android-gradle-plugin/issues/432