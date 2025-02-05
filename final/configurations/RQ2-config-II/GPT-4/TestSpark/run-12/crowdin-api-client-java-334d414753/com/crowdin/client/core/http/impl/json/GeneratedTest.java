package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.Assert;
import com.crowdin.client.core.http.exceptions.HttpException;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"test\"}";
        Project project = transformer.parse(json, Project.class);
        Assert.assertEquals("test", project.getName());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{name:\"test\"}";
        Project project = transformer.parse(json, Project.class);
    }

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{}";
        Project project = transformer.parse(json, Project.class);
        Assert.assertNotNull(project);
        Assert.assertNull(project.getName());
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("test");
        String json = transformer.convert(project);
        Assert.assertEquals("{\"name\":\"test\"}", json);
    }

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer transformer = mock(JacksonJsonTransformer.class);
        Project project = new Project();
        project.setName("test");

        doThrow(new RuntimeException()).when(transformer).convert(project);
        transformer.convert(project);
    }

    @Test
    public void convertEmptyObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        String json = transformer.convert(project);
        Assert.assertEquals("{}", json);
    }

}