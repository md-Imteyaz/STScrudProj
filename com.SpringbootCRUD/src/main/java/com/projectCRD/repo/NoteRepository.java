package com.projectCRD.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projectCRD.Entity.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note, Integer> {

}
