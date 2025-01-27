package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertProjectToStringTest {

    @Mock
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @Test
    public void convertProjectToStringTest() {
        Project project = new Project();
        project.setId(1L);
        project.setName("Crowdin");

        String result = (String) JsonTransformer.convert(project);

        assertFalse(result.isEmpty());
    }

}