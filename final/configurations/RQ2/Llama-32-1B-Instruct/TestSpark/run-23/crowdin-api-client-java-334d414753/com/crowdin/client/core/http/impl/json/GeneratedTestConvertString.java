package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JsonTransformer;
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.List;

public class GeneratedTestConvertString {

    public static String createJsonTransformer() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDeserializationFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.registerModule(new SimpleModule());
        return mapper.writeValueAsString(new Project());
    }

    @Test
    public void testConvertString() throws JsonProcessingException {
        String string = "key";
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String actual = transformer.convert(string);
        assertEquals("key", actual);
    }

}