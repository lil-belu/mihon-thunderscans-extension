package eu.kanade.tachiyomi.extension.en.thunderscans

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class ThunderScans : Madara(
    "Thunder Scans",
    "https://en-thunderscans.com",
    "en",
) {
    // Use new chapter endpoint (tweak if the site uses the old one)
    override val useNewChapterEndpoint: Boolean = true

    // Adjust date parsing if chapters show different format on the site
    override val dateFormat: SimpleDateFormat = SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH)

    // If the series URLs are /series/<slug> or /comic/<slug>, uncomment one of these:
    // override val mangaSubString = "series"
    // override val mangaSubString = "comic"
}
