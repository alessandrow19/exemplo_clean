package org.example.use_case

import org.example.entitiesv1.Fruta
import org.example.entitiesv1.FrutaRepository

class ListarFrutasUseCase(private val repository: FrutaRepository) {


   fun listarTodasFrutas(): List<Fruta>{

         val lista =repository.getFrutas()
        if (lista.isEmpty()) {

            return emptyList()
        }



       return lista

   }

}