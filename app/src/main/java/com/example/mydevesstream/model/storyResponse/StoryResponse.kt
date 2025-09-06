package com.example.mydevesstream.model.storyResponse

data class Story(
    val id: String,
    val headline: String,
    val heroImage: HeroImage,
    val creationDate: String,
    val modifiedDate: String,
    val contents: List<Content>
)

data class HeroImage(
    val imageUrl: String,
    val accessibilityText: String
)

data class Content(
    val type: String,
    val text: String? = null,
    val url: String? = null,
    val accessibilityText: String? = null
)

