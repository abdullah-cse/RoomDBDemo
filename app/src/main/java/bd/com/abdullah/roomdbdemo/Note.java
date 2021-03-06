package bd.com.abdullah.roomdbdemo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String description;
    private int priority;

    //Note Constructor
    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }
    //Setter Method
    public void setId(int id) {

        this.id = id;
    }

    //Getter method
    public int getId() {

        return id;
    }

    public String getTitle() {

        return title;
    }

    public String getDescription() {

        return description;
    }

    public int getPriority() {

        return priority;
    }
}
