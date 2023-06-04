package api.collectionservice.payload.request;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateSourceRequest {

    private String sourceName;
    private String sourceURL;
    private String exceptTag;
    private Integer exceptValues;
}
