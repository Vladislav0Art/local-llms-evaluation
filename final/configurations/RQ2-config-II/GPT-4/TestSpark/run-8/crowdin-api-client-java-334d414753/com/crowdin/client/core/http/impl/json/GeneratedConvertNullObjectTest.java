package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertNullObjectTest {

    // Test the parse() method when correct json and class type is provided

    @Test
    public void convertNullObjectTest() throws Exception {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String output = jsonTransformer.convert(null);
    }

}