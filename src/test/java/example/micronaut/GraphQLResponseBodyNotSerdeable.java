package example.micronaut;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.micronaut.core.annotation.Introspected;

import java.util.Map;

@Introspected
public class GraphQLResponseBodyNotSerdeable {

    private final Map<String, Object> specification;

    /**
     * Default constructor.
     *
     * @param specification the GraphQL response body data
     */
    @JsonCreator
    public GraphQLResponseBodyNotSerdeable(Map<String, Object> specification) {
        this.specification = specification;
    }

    /**
     * Returns the GraphQL response body data.
     *
     * @return the GraphQL response body data
     */
    @JsonAnyGetter
    @JsonInclude
    public Map<String, Object> getSpecification() {
        return specification;
    }
}
