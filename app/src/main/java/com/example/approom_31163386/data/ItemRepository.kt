import com.example.approom_31163386.data.Item
import kotlinx.coroutines.flow.Flow

/**
 * Repositório que fornece operações de inserção, atualização, exclusão e recuperação de [Item] de uma fonte de dados específica.
 */
interface ItemsRepository {
    /**
     * Recupera todos os itens da fonte de dados especificada.
     */
    fun getAllItemsStream(): Flow<List<Item>>

    /**
     * Recupera um item da fonte de dados que corresponde ao [id].
     */
    fun getItemStream(id: Int): Flow<Item?>

    /**
     * Insere um item na fonte de dados.
     */
    suspend fun insertItem(item: Item)

    /**
     * Exclui um item da fonte de dados.
     */
    suspend fun deleteItem(item: Item)

    /**
     * Atualiza um item na fonte de dados.
     */
    suspend fun updateItem(item: Item)
}
