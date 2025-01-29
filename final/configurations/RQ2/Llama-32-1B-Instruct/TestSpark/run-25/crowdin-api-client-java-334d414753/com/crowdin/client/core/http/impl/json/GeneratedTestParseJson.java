package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class GeneratedTestParseJson {

    public static ObjectMapper mapper;

    @Before
    public void setup() throws Exception {
        mapper = new ObjectMapper();
    }

    @Test
    public void testParseJson() {
        String json = "{\"key\":\"value\"}";
        Project project = mapper.readValue(json, Project.class);
        assertEquals("Value", project.getKey());
    }

}