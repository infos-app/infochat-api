package io.sween.noname

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class NonameApplication

fun main(args: Array<String>) {
    runApplication<NonameApplication>(*args)
}
