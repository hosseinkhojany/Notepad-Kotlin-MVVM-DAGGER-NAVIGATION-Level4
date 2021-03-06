package james_gosling.projects.notepad_kotlin.persistence

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Note::class],version = 1)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao
}