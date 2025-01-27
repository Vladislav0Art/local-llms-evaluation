package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseMethodUnderTest parsesToJsonCorrectlyWhenProvidedValidJsonStringAndClass {

    private JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    public void setup() {
        // setup
    }

    @Test
    public void parseMethodUnderTest

    parsesToJsonCorrectlyWhenProvidedValidJsonStringAndClass() {
        when(getObjectMapper().findAndBindJavaType(any(), any())).thenReturn(new Project());
        String json = "{\"projectName\":\"MyProject\"}";
        Class<Project> clazz = Project.class;
        Project result = jsonTransformer.parse(json, clazz);
        assertEquals("MyProject", result.getName());
    }

}