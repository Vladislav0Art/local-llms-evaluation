package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerTest;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonFieldVisitor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class GeneratedValidateParseSuccess {

    @Test
    public void validateParseSuccess() {
        String jsonString = "{\"key\":\"value\"}";
        List<Project> projects = (List<Project>) testObjectMapper.parse(jsonString, Project.class);
        JacksonJsonTransformerJacksonJsonTransformerTest.validate(projects, new ArrayList<>());
    }

}