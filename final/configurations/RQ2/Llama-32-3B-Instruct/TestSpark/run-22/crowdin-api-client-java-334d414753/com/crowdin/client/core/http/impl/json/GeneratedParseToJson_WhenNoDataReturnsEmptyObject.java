package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseToJson_WhenNoDataReturnsEmptyObject {

    @Mock
    private ObjectMapper objectMapper;

    @Test
    public void parseToJson_WhenNoDataReturnsEmptyObject() {
        when(objectMapper.createModule()).thenReturn(new SimpleModule());
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = transformer.parse("", Project.class);
        assertEquals(null, project);
    }

}