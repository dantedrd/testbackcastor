package co.com.castor.admininfoemployees.infrastructure.entrypoints.controller;

import co.com.castor.admininfoemployees.application.usecase.ResultPositionsUseCase;
import co.com.castor.admininfoemployees.domain.models.Position;
import co.com.castor.admininfoemployees.infrastructure.entrypoints.model.GenericResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/position")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {})
public class PositionController {
    private static final Logger logger = LoggerFactory.getLogger(PositionController.class);

    private final ResultPositionsUseCase resultPositionsUseCase;

    /**
     * Creates an instance of {@code PositionController} with necessary useCase.
     *
     * @param resultPositionsUseCase Port for operation calculations.
     */
    public PositionController(ResultPositionsUseCase resultPositionsUseCase) {
        this.resultPositionsUseCase = resultPositionsUseCase;
    }


    /**
     * Endpoint for retrieving all positions results.
     *
     * @return ResponseEntity containing a list of results or an error.
     */
    @Operation(
            summary = "Retrieve all positions results",
            description = "Fetches all the results of the positions in company.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Results retrieved successfully",
                            content = @Content(schema = @Schema(implementation = List.class))
                    )
            }
    )
    @GetMapping
    public ResponseEntity<Object> result() {
        logger.info("Fetching all results");
        List<Position> results = resultPositionsUseCase.getResults();
        return ResponseEntity.ok(GenericResponse.of(results, HttpStatus.OK));
    }
}
