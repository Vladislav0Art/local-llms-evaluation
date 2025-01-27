package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertToEmptyObjectTest {

    @Test
    public void convertToEmptyObjectTest() throws Exception {
        JsonConverter<Object> instance = new JsonConverter<>();
        instance.convertToEmptyObject(null);
    }

}