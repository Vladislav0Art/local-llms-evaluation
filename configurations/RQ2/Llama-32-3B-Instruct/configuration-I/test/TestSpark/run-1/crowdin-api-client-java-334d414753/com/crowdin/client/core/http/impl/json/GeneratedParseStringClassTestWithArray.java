package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mockito.Spy;
import com.crowdin.client.core.json.Json;
import com.crowdin.client.core.model.ObjectModel;

import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseStringClassTestWithArray {

    @Mock
    private ObjectMapper objectMapperMock;

    @Spy
    private String jsonMock = "{\"key\":\"value\"}";

    @InjectMocks
    public JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseStringClassTestWithArray() {
        when(objectMapperMock.readTree(jsonMock)).thenReturn(JsonNodeFactory.getInstance().jsonNode("[1, 2, 3]"));
        ObjectModel objectModel = jacksonJsonTransformer.parse("", ObjectModel.class);
        // verify the method implementation
    }

}