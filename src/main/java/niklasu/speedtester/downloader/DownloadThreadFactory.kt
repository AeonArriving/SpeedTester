package niklasu.speedtester.downloader

import com.google.common.eventbus.EventBus
import com.google.inject.Inject
import niklasu.speedtester.config.ConfigProvider
import java.net.URL


class DownloadThreadFactory
@Inject constructor(private val eventBus: EventBus, private val configProvider: ConfigProvider) {
    fun getInstance(): DownloadThread {
        return DownloadThread(eventBus, URL(configProvider.url), configProvider.size)

    }
}