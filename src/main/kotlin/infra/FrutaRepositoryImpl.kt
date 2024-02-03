package org.example.infra

import org.example.entitiesv1.Fruta
import org.example.entitiesv1.FrutaRepository

class FrutaRepositoryImpl :FrutaRepository {

      private val listaFrutas= mutableListOf<Fruta>()

      override fun getFrutas(): List<Fruta> {

            val fruta0= Fruta(1, "maça",2)
            val fruta1= Fruta(2, "laranja",20)
            val fruta2= Fruta(3, "abacaxi",4)

            listaFrutas.add(fruta0)
            listaFrutas.add(fruta1)
            listaFrutas.add(fruta2)

            return listaFrutas

      }


}