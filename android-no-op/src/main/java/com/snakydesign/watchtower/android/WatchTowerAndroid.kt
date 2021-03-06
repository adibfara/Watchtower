package com.snakydesign.watchtower.android

import android.app.Application
import android.support.v4.app.NotificationCompat
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow


object WatchTowerAndroid {
    fun notificationFlow(
        application: Application,
        serverPort: Int
    ): Flow<NotificationCompat.Builder> {
        return emptyFlow()
        // no-op
    }
}