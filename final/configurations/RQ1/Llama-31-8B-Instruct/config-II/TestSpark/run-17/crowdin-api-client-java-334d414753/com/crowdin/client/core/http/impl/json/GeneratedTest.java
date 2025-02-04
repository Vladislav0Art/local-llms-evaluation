package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public void parse_HttpExceptionTest() {
        String json = "{\"message\":\"test\"}";
        when(jacksonJsonTransformer.objectMapper.readValue(json, HttpException.class)).thenReturn(new HttpException());
        HttpException result = jacksonJsonTransformer.parse(json, HttpException.class);
        assertEquals(HttpException.class, result.getClass());
    }

    @Test
    public void parse_HttpBadRequestExceptionTest() {
        String json = "{\"message\":\"test\"}";
        when(jacksonJsonTransformer.errorObjectMapper.readValue(json, HttpBadRequestException.class)).thenReturn(new HttpBadRequestException());
        HttpBadRequestException result = jacksonJsonTransformer.parse(json, HttpBadRequestException.class);
        assertEquals(HttpBadRequestException.class, result.getClass());
    }

    @Test
    public void parse_ProjectTest() {
        String json = "{\"id\":1,\"name\":\"test\"}";
        when(jacksonJsonTransformer.objectMapper.readValue(json, Project.class)).thenReturn(new Project());
        Project result = jacksonJsonTransformer.parse(json, Project.class);
        assertEquals(Project.class, result.getClass());
    }

    @Test
    public void parse_FileInfoTest() {
        String json = "{\"id\":1,\"name\":\"test\"}";
        when(jacksonJsonTransformer.objectMapper.readValue(json, FileInfo.class)).thenReturn(new FileInfo());
        FileInfo result = jacksonJsonTransformer.parse(json, FileInfo.class);
        assertEquals(FileInfo.class, result.getClass());
    }

}