package edu.ucne.parcial2_jhon

import androidx.compose.foundation.lazy.items
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.parcial2_jhon.data.remote.VerboDto
import edu.ucne.parcial2_jhon.data.remote.VerboRepositori
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.getAndUpdate
import kotlinx.coroutines.launch
import okio.IOException
import javax.inject.Inject

data class VerbosListUiState(
    val verbos : List<VerboDto> = emptyList()
)

@HiltViewModel
class VerboViewModel @Inject constructor(
    private val api: VerboRepositori
): ViewModel(){

    private val _uiState = MutableStateFlow(VerbosListUiState())
    val uiState : StateFlow<VerbosListUiState> = _uiState.asStateFlow()


    init {
        viewModelScope.launch {
            _uiState.getAndUpdate {
                try {
                    it.copy(verbos = api.getVerbos())
                }catch (ioe: IOException){
                    it.copy(verbos = emptyList())
                }
            }
        }
    }

}
























/*
val VerbosList:List<VerboDto> = emptyList()

LazyColumn{
    items(VerbosList){ verbo ->
        verbosCard(verbo = VerboDto(
            verbo.Verbo,
            verbo.Categoria,
            verbo.Nivel,
            verbo.Imagen
        )
        )
    }
}*/
