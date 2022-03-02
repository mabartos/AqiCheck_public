package cz.muni.aqicheck.repository

import cz.muni.aqicheck.data.AqiPresentableListItem

// TODO 4.2 Data layer
class AqiRepository {

    fun getMockedData(): List<AqiPresentableListItem> =
        mutableListOf<AqiPresentableListItem>().apply {
            repeat(10) {
                AqiPresentableListItem(
                    id = it.toLong(),
                    aqi = "aqi-$it",
                    time = System.currentTimeMillis().toString(),
                    station = "Station $it",
                    isFavorite = it % 2 == 0
                )
            }
        }

}