package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GeneratedParseNullJson {

    @Test
    public void parseNullJson() {
        JacksonJsonTransformer instance = new JacksonJsonTransformer();
        instance.parse(null, null);
    }

}