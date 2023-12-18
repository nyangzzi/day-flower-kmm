package com.nyangzzi.dayflowers

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform