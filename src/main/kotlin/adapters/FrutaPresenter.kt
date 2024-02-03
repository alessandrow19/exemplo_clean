package org.example.adapters

import org.example.entitiesv1.Fruta

class FrutaPresenter {

    fun apresentar(lista :List<Fruta> ){


        lista.forEach {
            println("nome: ${it.fruta}, quantidade: ${it.quantidade}")

        }
    }

}