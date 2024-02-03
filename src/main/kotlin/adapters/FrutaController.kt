package org.example.adapters
import org.example.use_case.ListarFrutasUseCase

class FrutaController(private val frutasUseCase: ListarFrutasUseCase, private val presenters: FrutaPresenter) {


    fun  listarTodasFrutas(){

        val listafrutas=frutasUseCase.listarTodasFrutas()

        presenters.apresentar(listafrutas)

    }

}