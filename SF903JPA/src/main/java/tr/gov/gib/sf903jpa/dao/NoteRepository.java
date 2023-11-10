package tr.gov.gib.sf903jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.gov.gib.sf903jpa.dao.model.Note;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note,Long> {
    List<Note> getAllByNameContainsIgnoreCase(String search);
}
