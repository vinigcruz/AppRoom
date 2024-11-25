import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.rgm31163386.data.Item
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)

    @Query("SELECT * FROM itens WHERE id = :id")
    fun getItem(id: Int): Flow<Item>

    @Query("SELECT * from itens ORDER BY name ASC")
    fun getAllItems(): Flow<List<Item>>
}