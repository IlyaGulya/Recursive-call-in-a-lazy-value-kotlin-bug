package dev.gulya.bitwarden.kotlinlazyrecursiondetectedexample

import javax.inject.Scope

@TestComponent.TestScope
interface TestComponent {

    @Retention(AnnotationRetention.RUNTIME)
    @Scope
    annotation class TestScope
}