package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class GeneratedTestCrowdinException {


}

package com.crowdin.client.core.http.impl.json;

import org.junit.jupiter.api.Test;
import java.util.Optional;

public class GeneratedTest {

    @Test
    public void testCrowdinException() {
        String json = "{\"name\": \"test-project\"}";
        JsonNode errorsJsonNode = JacksonJsonTransformer.parse(json, JsonNode.class).get("errors");
        CrowdinApiException exception = convertToCrowdinApiException(errorsJsonNode);
        assert exception.getMessage().contains("error message");
    }

    public static CrowdinApiException convertToCrowdinApiException(JsonNode errorsJsonNode) {
        Optional<CrowdinApiException> exceptionOptional = JacksonJsonTransformer.convert(errorsJsonNode);
        return exceptionOptional.get();
    }

    public interface CrowdinJsonConverter {
        void convert(JsonNode jsonNode, Object target);
    }

}