package com.projectCRD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projectCRD.Entity.Note;
import com.projectCRD.Service.NoteService;

@RestController
@RequestMapping("/note")
public class NoteController {

	@Autowired
	private NoteService noteService;

	@GetMapping("/allnote")
	public ResponseEntity<List<Note>> getAllNote() {
		List<Note> note = null;
		try {
			note = noteService.getAllUsers();

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Note>>(note, HttpStatus.OK);
	}

	@GetMapping("/getNoteById/{id}")
	public ResponseEntity<Note> getNoteById(@PathVariable("id") int id) {
		Note note = null;
		try {
			note = noteService.getNoteById(id);

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Note>(note, HttpStatus.OK);
	}
	
	@PostMapping("/addorUpdate")
	public ResponseEntity<Note> addorUpadate(@RequestBody Note note) {
		Note notes=null;
		try {
			note = noteService.addorUpdateNote(note);

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Note>(note, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Note> deleteId(@PathVariable("id") int id) {
		Note note= null;
		try {
			note = noteService.deleteNote( id);

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Note>(note, HttpStatus.OK);
	}
	

}
