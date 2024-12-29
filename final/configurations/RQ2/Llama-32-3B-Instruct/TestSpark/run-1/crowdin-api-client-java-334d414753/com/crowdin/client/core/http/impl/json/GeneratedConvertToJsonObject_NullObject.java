package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class GeneratedConvertToJsonObject_NullObject {

    @Test
    public void convertToJsonObject_NullObject() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new SimpleModule());
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setProperty(PropertyAccessor.FIELD, JsonInclude.Include.NON_NULL);

        Class<LanguageTranslations> clazz = LanguageTranslations.class;
        LanguageTranslations obj = null;

        String json = transformer.convert(obj);
        assertNull(json);
    }
}

class LanguageTranslations {
    private String name;
    private double version;
    private String lang;

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "{\"name\":\"" + name + "\",\"version\":" + version + ",\"lang\":\"" + lang + "\"}";
    }

}