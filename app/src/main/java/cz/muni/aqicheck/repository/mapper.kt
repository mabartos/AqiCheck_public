package cz.muni.aqicheck.repository

import cz.muni.aqicheck.data.AqiPresentableListItem
import cz.muni.aqicheck.database.FavoriteStationEntity
import cz.muni.aqicheck.webservice.response.AqiListItem

fun AqiListItem.toAqiPresentableItem(isFavorite: Boolean): AqiPresentableListItem =
    TODO() // TODO 6.2 (S) -> napsání mapperu

fun AqiPresentableListItem.toFavoriteStationEntity(): FavoriteStationEntity =
    FavoriteStationEntity(
        id = this.id,
        lastKnownAqi = this.aqi,
        lastSyncTime = this.time,
        station = this.station,
    )

fun FavoriteStationEntity.toAqiPresentableItem() =
    AqiPresentableListItem(
        id = this.id,
        aqi = this.lastKnownAqi,
        time = this.lastSyncTime,
        station = this.station,
        isFavorite = true,
    )