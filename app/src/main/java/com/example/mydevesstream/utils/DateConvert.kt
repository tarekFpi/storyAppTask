package com.example.mydevesstream.utils
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

object DateConvert {

    fun formatRelativeTime(dateString: String): String {
        // Input format from JSON
        val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())
        sdf.timeZone = TimeZone.getTimeZone("UTC")

        val date: Date = sdf.parse(dateString) ?: return "Unknown"
        val now = Date()

        val diffInMillis = now.time - date.time

        val minutes = TimeUnit.MILLISECONDS.toMinutes(diffInMillis)
        val hours = TimeUnit.MILLISECONDS.toHours(diffInMillis)
        val days = TimeUnit.MILLISECONDS.toDays(diffInMillis)

        return when {
            minutes < 1 -> "Just now"
            minutes < 60 -> "${minutes}m ago"
            hours < 24 -> "${hours}h ago"
            days < 7 -> "${days}d ago"
            else -> SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(date)
        }
    }

}