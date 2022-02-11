package com.projectCRD.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "note")
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "note")
	private String note;

	@Override
	public String toString() {
		return "Users [id=" + id + ", note=" + note + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Note(int id, String note) {
		super();
		this.id = id;
		this.note = note;
	}

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

}
