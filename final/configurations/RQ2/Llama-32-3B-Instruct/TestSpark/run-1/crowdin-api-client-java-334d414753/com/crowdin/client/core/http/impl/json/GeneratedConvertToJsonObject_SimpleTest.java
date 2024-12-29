package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class GeneratedConvertToJsonObject_SimpleTest {

    @Test
    public void convertToJsonObject_SimpleTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new SimpleModule());
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setProperty(PropertyAccessor.FIELD, JsonInclude.Include.NON_NULL);

        Class<LanguageTranslations> clazz = LanguageTranslations.class;
        LanguageTranslations obj = new LanguageTranslations();
        obj.setName("English");
        obj.setVersion((long) 1.0); // Fixed line
        obj.setLang("en");

        String json = transformer.convert(obj);
        assertEquals("{\"name\":\"English\",\"version\":1.0,\"lang\":\"en\"}", json);
    }

}