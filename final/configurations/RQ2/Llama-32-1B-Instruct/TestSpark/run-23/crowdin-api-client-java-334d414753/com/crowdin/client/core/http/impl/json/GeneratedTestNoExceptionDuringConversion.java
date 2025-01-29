package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JsonTransformer;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.impl.json.JsonFactory;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.SneakyThrows;

public class GeneratedTestNoExceptionDuringConversion {

    public static String createJsonTransformer() {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(Project.class, JacksonJsonTransformer.class);
        mapper.registerModule(module);
        return mapper.writeValueAsString(new Project());
    }

    @Test
    public void testNoExceptionDuringConversion() {
        String json = createJsonTransformer();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String actual = transformer.convert(json);
        assertNotNull(actual);
    }

}