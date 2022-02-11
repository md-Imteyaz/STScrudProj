package com.projectCRD.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectCRD.Entity.Note;
import com.projectCRD.Service.NoteService;
import com.projectCRD.repo.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteRepository noteRepository;

	@Override
	public List<Note> getAllUsers() {
		return (List<Note>) noteRepository.findAll();
	}

	@Override
	public Note getNoteById(int id) {

		return noteRepository.findById(id).orElse(null);
	}

	@Override
	public Note addorUpdateNote(Note note) {
		return noteRepository.save(note);
	}

	@Override
	public Note deleteNote(int id) throws Exception {
		Note deletedUser = null;
		try {
			deletedUser = noteRepository.findById(id).orElse(null);
			if (deletedUser == null) {
				throw new Exception("user not availaible");
			} else {
				noteRepository.deleteById(id);
			}

		} catch (Exception ex) {
			throw ex;
		}
		return deletedUser;
	}

}
