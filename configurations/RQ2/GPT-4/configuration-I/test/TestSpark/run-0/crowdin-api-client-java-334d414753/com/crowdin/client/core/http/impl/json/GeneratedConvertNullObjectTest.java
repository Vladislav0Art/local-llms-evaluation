package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.mockito.Mockito;

public class GeneratedConvertNullObjectTest {

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        jacksonJsonTransformer.convert(null);
    }

}