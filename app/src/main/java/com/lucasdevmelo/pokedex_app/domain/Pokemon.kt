package com.lucasdevmelo.pokedex_app.domain

data class Pokemon(
    val imageUrl: String,
    val number:Int,
    val name: String,
    val types: List<PokemonType>
)