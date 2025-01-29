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

public class GeneratedTestConvertObject {

    @Test
    public void testConvertObject() {
        JacksonJsonTransformerImpl transformer = new JacksonJsonTransformerImpl();
        FileInfo fileInfo = new FileInfo(1L, "test", new Date());
        String json = "{\"id\":123,\"name\":\"test\",\"createdDate\":\"2022-01-01T00:00:00\"}";
        Object result = transformer.parse(json, FileInfo.class);
        assert (result instanceof FileInfo && ((FileInfo) result).equals(fileInfo));
    }

}