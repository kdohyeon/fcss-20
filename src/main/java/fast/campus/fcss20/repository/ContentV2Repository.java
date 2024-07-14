package fast.campus.fcss20.repository;

import fast.campus.fcss20.domain.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContentV2Repository extends JpaRepository<Content, Integer> {
    @Query("SELECT c FROM Content c WHERE c.name LIKE %:name% AND c.owner=?#{authentication.name}")
    List<Content> findContentsByNameContaining(String name);
}
