package com.example.mynotes.listeners;

import com.example.mynotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note,int position);
}
