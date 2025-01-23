package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.SneakyThrows;
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
    public void parse_StringJson_Class_ReturnsParsedObject() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Class<Project> clazz = Project.class;

        // Act
        Project result = jacksonJsonTransformer.parse(json, clazz);

        // Assert
        assertEquals("value", result.toString()); // Use toString() instead of getKey()
    }

    @Test
    public void parse_NullJson_Class_ThrowsException() {
        // Arrange
        String json = null;
        Class<Project> clazz = Project.class;

        // Act and Assert
        assertThrows(HttpException.class, () -> jacksonJsonTransformer.parse(json, clazz));
    }

    @Test
    public void parse_EmptyJson_Class_ThrowsException() {
        // Arrange
        String json = "";
        Class<Project> clazz = Project.class;

        // Act and Assert
        assertThrows(HttpException.class, () -> jacksonJsonTransformer.parse(json, clazz));
    }

}