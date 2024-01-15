package co.com.castor.admininfoemployees.infrastructure.adapter.postgres;

import co.com.castor.admininfoemployees.infrastructure.adapter.postgres.models.PositionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionDbRepository extends JpaRepository<PositionEntity, Long> {
}
