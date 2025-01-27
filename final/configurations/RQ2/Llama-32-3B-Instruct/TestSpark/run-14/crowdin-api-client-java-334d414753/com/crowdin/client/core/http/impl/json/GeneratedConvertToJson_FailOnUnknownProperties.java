package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

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

public class GeneratedConvertToJson_FailOnUnknownProperties {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        ObjectMapper mapper = OBJECT_MAPPER;
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addDeserializer(Project.class, ProjectDeserializer.class);
        simpleModule.addDeserializer(ExportOptions.class, ExportOptionsDeserializer.class);
        simpleModule.addDeserializer(FileInfo.class, FileInfoDeserializer.class);
        simpleModule.addDeserializer(ImportOptions.class, ImportOptionsDeserializer.class);
        simpleModule.addDeserializer(LanguageTranslations.class, LanguageTranslationsDeserializer.class);

        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setDeserializationFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.registerModule(simpleModule);
    }

    @Test
    public void convertToJson_FailOnUnknownProperties() throws Exception {
        Project project = null;
        JsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"ProjectName\",\"unknownProperty\":\"UnknownValue\"}";
        project = transformer.convert(project);
        assert json == null;
    }

}