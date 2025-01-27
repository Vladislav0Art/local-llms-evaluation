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
public class GeneratedConvertToJson_WhenDataReturnsValidProject {

    @Mock
    private ObjectMapper objectMapper;

    @Test
    public void convertToJson_WhenDataReturnsValidProject() {
        Project project = new Project(1L, "Crowdin");
        when(objectMapper.createModule()).thenReturn(new SimpleModule());
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = transformer.convert(project);
        assertEquals("{\"id\": 1, \"name\": \"Crowdin\"}", json);
    }

}