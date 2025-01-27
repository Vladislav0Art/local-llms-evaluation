package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GeneratedParseAndConvertTest {

    @Test
    public void parseAndConvertTest() throws Exception {
        String jsonStr = "{\"project\":{\"id\":1,\"name\":\"crowdin\",\"created_at\":\"2010-10-29\"}}";
        JsonConverter<Project> instance = new JsonConverter<>();
        Project obj = instance.parse(jsonStr);
        assertNotNull(obj);
    }

}