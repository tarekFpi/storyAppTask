import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName("title")
    val title: String? = null,

    @SerializedName("data")
    val data: List<NewsData>? = null
)

data class NewsData(
    @SerializedName("id")
    val id: String? = null,

    @SerializedName("type")
    val type: String? = null,   // "story", "weblink", "advert"

    @SerializedName("headline")
    val headline: String? = null,

    @SerializedName("teaserText")
    val teaserText: String? = null,

    @SerializedName("creationDate")
    val creationDate: String? = null,

    @SerializedName("modifiedDate")
    val modifiedDate: String? = null,

    @SerializedName("teaserImage")
    val teaserImage: TeaserImage? = null,

    @SerializedName("weblinkUrl")
    val weblinkUrl: String? = null,

    @SerializedName("url")
    val url: String? = null   // advert case
)

data class TeaserImage(
    @SerializedName("accessibilityText")
    val accessibilityText: String? = null,

    @SerializedName("_links")
    val links: Links? = null
)

data class Links(
    @SerializedName("url")
    val url: UrlData? = null
)

data class UrlData(
    @SerializedName("href")
    val href: String? = null,

    @SerializedName("templated")
    val templated: Boolean? = null,

    @SerializedName("type")
    val type: String? = null
)
