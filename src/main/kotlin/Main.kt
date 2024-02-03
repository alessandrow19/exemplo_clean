package org.example
import org.example.adapters.FrutaController
import org.example.adapters.FrutaPresenter
import org.example.infra.FrutaRepositoryImpl
import org.example.use_case.ListarFrutasUseCase

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args : Array<String>) {

    val repositorio = FrutaRepositoryImpl()
    val frutasUseCase = ListarFrutasUseCase(repositorio)
    val presenters =FrutaPresenter()
    val controlerFruta = FrutaController(frutasUseCase, presenters)

    controlerFruta.listarTodasFrutas()

    // s*

}
