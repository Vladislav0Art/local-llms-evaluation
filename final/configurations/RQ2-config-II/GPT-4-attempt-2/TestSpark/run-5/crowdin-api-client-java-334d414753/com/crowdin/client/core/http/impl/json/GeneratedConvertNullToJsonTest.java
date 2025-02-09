package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertNullToJsonTest {

    @Test
    public void convertNullToJsonTest() throws JsonProcessingException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(null);
    }

}