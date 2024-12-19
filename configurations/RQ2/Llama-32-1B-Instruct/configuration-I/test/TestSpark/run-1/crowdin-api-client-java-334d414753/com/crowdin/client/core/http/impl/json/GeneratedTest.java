package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.impl.json.JsonTransformationException;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void test_parse

    JsonArray() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, 3]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNull() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithMultipleElements() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, 3, 4]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(4, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullElements() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonObject() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "{\"key\":\"value\"}";
        Object parsedObject = jsonTransformer.parse(jsonString, String.class);
        assertEquals("value", (String) parsedObject);
    }

    @Test
    public void test_parse

    JsonObjectWithNullKeys() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "{\"key\":null,\"other\":\"value\"}";
        Object parsedObject = jsonTransformer.parse(jsonString, String.class);
        assertEquals("value", (String) parsedObject);
    }

    @Test
    public void test_parse

    JsonObjectWithNullValues() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "{\"key\":null,\"other\":[1, 2]}";
        Object parsedObject = jsonTransformer.parse(jsonString, String.class);
        assertEquals("value", (String) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNonJsonStringElements() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, 'three', null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNonJsonStringElementsAndNull() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null, 'three')";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(4, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNonJsonStringElementsAndNullValues() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null, [3, 4]]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(4, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullElementsAndNonJsonString() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullElementsAndNonJsonStringValues() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullAndNonJsonString() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullAndNonJsonStringValues() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullAndNonJsonString() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullAndNonJsonStringValues() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullAndNonJsonString() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullAndNonJsonStringValues() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullAndNonJsonString() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullAndNonJsonStringValues() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

    @Test
    public void test_parse

    JsonArrayWithNullAndNonJsonString() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

}