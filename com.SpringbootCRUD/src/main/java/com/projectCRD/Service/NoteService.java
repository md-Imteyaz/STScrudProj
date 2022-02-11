package com.projectCRD.Service;

import java.util.List;

import com.projectCRD.Entity.Note;

public interface NoteService {
	public List<Note> getAllUsers();

	public Note getNoteById(int id);

	public Note addorUpdateNote(Note note);

	public Note deleteNote(int id) throws Exception;


}
