package com.aj.serve.torce.torcedores.controller

import com.aj.serve.torce.torcedores.model.Teste
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class TesteController {

    @RequestMapping("/gettext")
    fun get(): Teste {
        return Teste(AtomicLong().incrementAndGet(),"john")
    }
}