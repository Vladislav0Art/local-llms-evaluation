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
public class GeneratedParseWithNullJsonTest {

    @InjectMocks
    private JacksonJsonTransformer jacksonJsonTransformer;

    @Test
    public void parseWithNullJsonTest() throws Exception {
        // Arrange
        String json = null;
        Class<?> clazz = String.class;
        // Act and Assert
        assertThrows(Exception.class, () -> jacksonJsonTransformer.parse(json, clazz));
    }

}