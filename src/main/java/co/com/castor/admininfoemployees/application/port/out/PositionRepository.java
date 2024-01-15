package co.com.castor.admininfoemployees.application.port.out;

import co.com.castor.admininfoemployees.domain.models.Position;

import java.util.List;

public interface PositionRepository {
    List<Position> getAllPositions();
}
