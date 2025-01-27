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
public class GeneratedTest {

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

    @Test
    public void parseMethodUnderTest_throwsCrowdinApiExceptionWhenProvidedInvalidJsonString() {
        when(getObjectMapper().findAndBindJavaType(any(), any())).thenThrow(new CrowdinApiException());
        String json = "{\"projectName\":\"MyProject\"}";
        Class<Project> clazz = Project.class;
        assertThrows(CrowdinApiException.class, () -> jsonTransformer.parse(json, clazz));
    }

    @Test
    public void parseMethodUnderTest_throwsHttpExceptionWhenProvidedInvalidJsonStringAndClass() {
        when(getObjectMapper().findAndBindJavaType(any(), any())).thenThrow(new HttpException());
        String json = "{\"projectName\":\"MyProject\"}";
        Class<Project> clazz = Project.class;
        assertThrows(HttpException.class, () -> jsonTransformer.parse(json, clazz));
    }

    @Test
    public void convertMethodUnderTestConvertsToJsonCorrectlyWhenProvidedValidObject() {
        when(getObjectMapper().writeValueAsString(any())).thenReturn("{\"projectName\":\"MyProject\"}");
        ExportOptions obj = new ExportOptions();
        obj.setProjectName("MyProject");
        String result = jsonTransformer.convert(obj);
        assertEquals("{\"projectName\":\"MyProject\"}", result);
    }

    @Test
    public void convertMethodUnderTest_throwsCrowdinApiExceptionWhenProvidedInvalidObject() {
        when(getObjectMapper().writeValueAsString(any())).thenThrow(new CrowdinApiException());
        ExportOptions obj = new ExportOptions();
        assertThrows(CrowdinApiException.class, () -> jsonTransformer.convert(obj));
    }

    @Test
    public void convertMethodUnderTest_throwsHttpExceptionWhenProvidingInvalidObject() {
        when(getObjectMapper().writeValueAsString(any())).thenThrow(new HttpException());
        ExportOptions obj = new ExportOptions();
        assertThrows(HttpException.class, () -> jsonTransformer.convert(obj));
    }
}

class JacksonJsonTransformerTestUtils {
    private ObjectMapper getObjectMapper() {
        // setup mock object mapper
        return new ObjectMapper();
    }

}