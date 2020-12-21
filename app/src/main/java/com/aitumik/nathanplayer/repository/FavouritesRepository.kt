package com.aitumik.nathanplayer.repository

interface FavouritesRepository {
    fun createFavourite(): Int
    fun songExist(id: Long): Boolean
    fun favExists(id: Long): Boolean
}

class FavouritesRepositoryImplements {

}