package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestSneakyThrows {

    @BeforeAll
    public static void setUpClass() {
        // Remove mocking for now, leave it as is
    }

    @BeforeEach
    public void setup() throws Exception {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testSneakyThrows() throws JsonProcessingException {
        String json = "{\"name\":\"John\",\"age\":30}";
        objectMapper.writeValue(new File("output.json"), json);
    }

}