package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.Assert;
import com.crowdin.client.core.http.exceptions.HttpException;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class GeneratedParseEmptyJsonTest {

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{}";
        Project project = transformer.parse(json, Project.class);
        Assert.assertNotNull(project);
        Assert.assertNull(project.getName());
    }

}