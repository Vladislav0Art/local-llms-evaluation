package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ObjectMapper objectMapper;

    @Test
    public void parse_project_json() {
        Project project = new Project();
        when(objectMapper.findAndReturnValuesForDeserialization(project.getClass(), "{}")).thenReturn(project);
        assertEquals(project, JacksonJsonTransformer.parse("", Project.class));
    }

    @Test
    public void parse_file_info_json() {
        FileInfo fileInfo = new FileInfo();
        when(objectMapper.findAndReturnValuesForDeserialization(fileInfo.getClass(), "{}")).thenReturn(fileInfo);
        assertEquals(fileInfo, JacksonJsonTransformer.parse("", FileInfo.class));
    }

    @Test
    public void convert_project_object_to_json() {
        Project project = new Project();
        String json = JacksonJsonTransformer.convert(project);
        assertEquals("{\"id\": 1, \"name\": \"project\"}", json);
    }

    @Test
    public void convert_file_info_object_to_json() {
        FileInfo fileInfo = new FileInfo();
        String json = JacksonJsonTransformer.convert(fileInfo);
        assertEquals("{\"id\": 1, \"fileName\": \"file.txt\"}", json);
    }

    @Test
    public void parse_invalid_project_json_throws_exception() {
        when(objectMapper.findAndReturnValuesForDeserialization(Project.class, "{}")).thenThrow(CrowdinApiException::new);
        JacksonJsonTransformer.parse("", Project.class);
    }

    @Test
    public void convert_none_object_to_null() {
        Object obj = null;
        String json = JacksonJsonTransformer.convert(obj);
        assertEquals(null, json);
    }

}