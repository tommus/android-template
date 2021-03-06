package co.windly.rename.data.persistence.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import co.windly.rename.data.persistence.database.entity.book.CharacterEntity;
import io.reactivex.Flowable;
import java.util.List;

@Dao
public abstract class CharacterDao extends BaseDao<CharacterEntity> {

  //region Book

  @Query("SELECT * FROM characters ORDER BY first_name ASC, last_name ASC")
  public abstract Flowable<List<CharacterEntity>> getAll();

  //endregion
}
