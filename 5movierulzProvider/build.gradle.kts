version = 5


cloudstream {
    language = "te"
    // All of these properties are optional, you can safely remove them

    description = "Please wait for 10seconds to bypass the ads"
    authors = listOf("darkdemon")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "TvSeries",
        "Movie",
        "Anime",
        "Cartoon"
    )

    iconUrl = "https://ww2.5movierulz.sh/wp-content/uploads/2016/10/favicon.ico"
}
