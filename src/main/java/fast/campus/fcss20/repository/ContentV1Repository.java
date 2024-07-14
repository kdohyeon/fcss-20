package fast.campus.fcss20.repository;

import fast.campus.fcss20.domain.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PostFilter;

import java.util.List;

public interface ContentV1Repository extends JpaRepository<Content, Integer> {
    @PostFilter("filterObject.owner == authentication.name")
    List<Content> findContentsByNameContaining(String name);
}
