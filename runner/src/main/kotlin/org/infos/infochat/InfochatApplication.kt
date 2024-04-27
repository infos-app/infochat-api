package org.infos.infochat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InfochatApplication

fun main(args: Array<String>) {
    runApplication<InfochatApplication>(*args)
}
