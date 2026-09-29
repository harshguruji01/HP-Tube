/*
 * HP Tube Project Original (2026)
 * HarshGuruJi (https://github.com/harshguruji01/HP-Tube)
 * Licenced Under GPL-3.0+
*/
package com.arslandaim.playtube.data.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GitHubRelease(
    @SerialName("tag_name")
    val tagName: String,
    @SerialName("body")
    val body: String,
    @SerialName("html_url")
    val htmlUrl: String
)
