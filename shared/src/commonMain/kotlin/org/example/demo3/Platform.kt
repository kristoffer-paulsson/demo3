package org.example.demo3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform