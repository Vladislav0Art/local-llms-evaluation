package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private JacksonJsonTransformer jacksonJsonTransformer;

    @Test
    public void parse_String_Class_ReturnsParsedObject() {
        // Arrange
        String json = "{\"key\":\"value\"}";
        Class<?> clazz = String.class;

        // Act
        Object result = jacksonJsonTransformer.parse(json, clazz);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void parse_HttpException_Class_ReturnsParsedObject() {
        // Arrange
        String json = "{\"message\":\"error\"}";
        Class<?> clazz = HttpException.class;

        // Act
        Object result = jacksonJsonTransformer.parse(json, clazz);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void parse_HttpBadRequestException_Class_ReturnsParsedObject() {
        // Arrange
        String json = "{\"message\":\"error\"}";
        Class<?> clazz = HttpBadRequestException.class;

        // Act
        Object result = jacksonJsonTransformer.parse(json, clazz);

        // Assert
        assertNotNull(result);
    }

}