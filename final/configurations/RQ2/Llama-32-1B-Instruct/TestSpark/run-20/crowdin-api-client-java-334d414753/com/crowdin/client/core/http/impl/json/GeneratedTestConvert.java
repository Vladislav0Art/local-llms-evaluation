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
import lombok.SneakyThrows;

public class GeneratedTestConvert {

    @Test
    public void testConvert() {
        JacksonJsonTransformerImpl transformer = new JacksonJsonTransformerImpl();
        Project project = new Project("test", "test");
        String json = "{\"name\":\"test\",\"id\":123,\"createdDate\":\"2022-01-01T00:00:00\"}";
        Object result = transformer.parse(json, Project.class);
        assert (result instanceof Project && ((Project) result).equals(project));
    }

}