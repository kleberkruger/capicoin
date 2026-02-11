package br.ufms.capicoin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform