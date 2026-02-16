package com.lince23.expedition33editor

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform