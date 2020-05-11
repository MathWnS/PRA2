import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "repair")
public class Repair {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "repairId")
    private int mId;
    @Nullable
    @ColumnInfo(name = "repairItem")
    private String mItem;
    public int getId() {
        return mId;
    }
    public void setId(@NonNull int id) {
        mId = id;
    }
    public String getItem() {
        return mItem;
    }
    public void setItem(@Nullable String item) {
        mItem = item;
    }
    public String getLocation() {
        return mLocation;
    }
    public void setAuthor(String location) {
        mLocation = location;
    }
    public String getCreationDate() {
        return mCreationDate;
    }
    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }
    private String mLocation;
    private String mCreationDate;
    public int getScore() {
        return mScore;
    }
    public void setScore(int score) {
        mScore = score;
    }
    private int mScore;
    public Book(String item, String location, int score, String creationDate) {
        mItem = item;
        mLocation = location;
        mScore = score;
        mCreationDate = creationDate;
    }
}