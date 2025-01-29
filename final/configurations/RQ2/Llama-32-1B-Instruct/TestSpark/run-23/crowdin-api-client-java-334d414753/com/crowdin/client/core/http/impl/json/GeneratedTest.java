package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JsonTransformer;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.impl.json.JsonFactory;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.SneakyThrows;

public class GeneratedTest {

    public static String createJsonTransformer() {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Project.class, JacksonJsonTransformer.class);
        mapper.registerModule(module);
        return mapper.writeValueAsString(new Project());
    }

    @Test
    public void testParseJson() throws JsonProcessingException {
        String json = createJsonTransformer();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.parse(json);
        assertNotNull(actual);
    }

    @Test
    public void testConvertStringNoMissingProperty() throws JsonProcessingException {
        String string = "key";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String actual = transformer.convert(string);
        assertEquals("value", actual);
    }

    @Test
    public void testConvertStringWithMissingProperty() throws JsonProcessingException {
        String json = "{\"key\": \"value\"}";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.convert(json);
        assertEquals("value", (String) actual);
    }

    @Test
    public void testNoExceptionDuringParsing() {
        String json = createJsonTransformer();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.parse(json, Project.class);
        assertNotNull(actual);
    }

    @Test
    public void testConvertStringWithEmptyList() throws JsonProcessingException {
        String string = "[\"key\", \"value\"]";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object actual = transformer.convert(string);
        assertEquals("\"key\",\"value\"", (String) actual);
    }

    @Test
    public void testNoExceptionDuringConversion() {
        String json = createJsonTransformer();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String actual = transformer.convert(json);
        assertNotNull(actual);
    }

}