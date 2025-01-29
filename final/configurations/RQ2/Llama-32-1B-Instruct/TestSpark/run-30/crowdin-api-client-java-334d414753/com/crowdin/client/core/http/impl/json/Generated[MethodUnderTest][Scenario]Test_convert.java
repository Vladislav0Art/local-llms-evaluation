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
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Generated[MethodUnderTest][Scenario]

Test_convert {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void [MethodUnderTest][Scenario]Test_convert() {
        String json = "{\"project_id\":\"1\",\"branch_id\":2,\"language\":\"French\"}";
        Project project = objectMapper.readValue(json, Project.class);
        assertEquals(1L, (int) project.getId());
        assertEquals(2L, (int) project.getBranchId());
        assertEquals("French", (String) project.getLanguage());
    }

}