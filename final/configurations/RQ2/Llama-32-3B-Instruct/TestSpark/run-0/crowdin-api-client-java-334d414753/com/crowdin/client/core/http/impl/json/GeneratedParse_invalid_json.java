package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

public class GeneratedParse_invalid_json {

    @Test
    public void parse_invalid_json() {
        JacksonJsonTransformer.parse("{\"invalid json\"}", Project.class);
    }

}