package api.collectionservice.repository;

import api.collectionservice.model.Source;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<Source,Integer> {
}
