package org.jetbrains.kotlinconf.data

import kotlinx.serialization.Serializable

@Serializable
class Vote(
    var sessionId: String,
    var rating: Int = 0 // -1 is negative, 0 is so-so, 1 is positive
)