package org.infos.infochat.`in`.auth

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("auth")
class LoginController {
    @PostMapping("oauth2/login")
    fun loginWithToken(loginDto: OAuth2TokenLoginDto) {

    }
}