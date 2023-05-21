package com.gmail.hostov47.translator_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform