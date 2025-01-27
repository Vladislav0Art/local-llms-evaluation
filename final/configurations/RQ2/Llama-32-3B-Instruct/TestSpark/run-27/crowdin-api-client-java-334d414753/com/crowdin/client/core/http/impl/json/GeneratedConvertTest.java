package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertTest {

    @Test
    public void convertTest() throws Exception {
        String jsonStr = "{\"language\":\"en\"}";
        JsonConverter<Language> instance = new JsonConverter<>();
        Language obj = instance.convert(jsonStr);
        assertNotNull(obj);
    }

}