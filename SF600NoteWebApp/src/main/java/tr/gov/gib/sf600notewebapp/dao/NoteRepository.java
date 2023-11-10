package tr.gov.gib.sf600notewebapp.dao;

import tr.gov.gib.sf600notewebapp.dao.model.Note;

import java.util.List;

public interface NoteRepository {
    List<Note> findAll();
    Note findById(Long id);
    void save(Note note);
    void update(Note note);
    void deleteById(Long id);

    void saveAll(List<Note> list);
}
