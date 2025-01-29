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
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.SneakyThrows;

public class GeneratedTestConvertString {

    public static class JsonValue {
        private String json;

        public String getJson() {
            return json;
        }

        @SneakyThrows
        public <T> T parse(String json, Class<T> clazz) {
            ObjectMapper mapper = new ObjectMapper();
            SimpleModule module = new SimpleModule();
            module.addDeserializer(T.class, JacksonJsonTransformerImpl.class);
            return mapper.readValue(json, clazz);
        }
    }

    @Test
    public void testConvertString() throws Exception {
        JsonValue jsonValue = new JsonValue();
        jsonValue.setJson("{\"project\":\"test-project\",\"language\":\"en-us\"}");
        String string = (String) jsonValue.convert(String.class);
        assertEquals("test-project en-us", string);
    }

}