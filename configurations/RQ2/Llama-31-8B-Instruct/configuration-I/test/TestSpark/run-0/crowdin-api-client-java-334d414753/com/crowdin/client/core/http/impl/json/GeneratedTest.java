package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private JacksonJsonTransformer jacksonJsonTransformer;

    @Test
    public void parseWithValidJsonAndClassTest() throws Exception {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Class<?> clazz = String.class;
        ObjectMapper mapper = new ObjectMapper();
        when(jacksonJsonTransformer.parse(json, clazz)).thenAnswer(invocation -> mapper.readValue(json, clazz));
        // Act
        Object result = jacksonJsonTransformer.parse(json, clazz);
        // Assert
        assertEquals("value", result);
    }

    @Test
    public void parseWithInvalidJsonTest() throws Exception {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Class<?> clazz = String.class;
        // Act and Assert
        assertThrows(Exception.class, () -> jacksonJsonTransformer.parse(json, clazz));
    }

    @Test
    public void parseWithNullJsonTest() throws Exception {
        // Arrange
        String json = null;
        Class<?> clazz = String.class;
        // Act and Assert
        assertThrows(Exception.class, () -> jacksonJsonTransformer.parse(json, clazz));
    }

    @Test
    public void parseWithNullClassTest() throws Exception {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Class<?> clazz = null;
        // Act and Assert
        assertThrows(Exception.class, () -> jacksonJsonTransformer.parse(json, clazz));
    }

    @Test
    public void parseWithNonStringJsonTest() throws Exception {
        // Arrange
        String json = "123";
        Class<?> clazz = String.class;
        // Act and Assert
        assertThrows(Exception.class, () -> jacksonJsonTransformer.parse(json, clazz));
    }

}