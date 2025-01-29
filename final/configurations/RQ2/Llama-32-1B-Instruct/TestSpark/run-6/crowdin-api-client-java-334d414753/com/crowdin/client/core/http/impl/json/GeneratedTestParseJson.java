package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestParseJson {

    private JacksonJsonTransformer transformer;
    private String json;
    private Project project;
    private Project parsedProject;
    private String convertedString;
    private Test SparkRunner;

    @Before
    public void setup() {
        this.transformer = new JacksonJsonTransformer();
        this.json = "{\"name\":\"John Doe\",\"age\":30}";
        this.project = JsonTransformer.parse(json, Project.class);
        this.parsedProject = transformer.parse(json, Project.class);
    }

    @Test
    public void testParseJson() {
        when(this.transformer.withDefaultSettings()).thenReturn(this.converter);
        JacksonJsonTransformer parseWithDefaultSettings = JacksonJsonTransformer.withDefaultSettings(transformer);
        try {
            Project parsedProject2 = parseWithDefaultSettings.parse(json, Project.class);
            assertEquals(project.getName(), "John Doe");
            assertEquals(project.getAge(), 30);
        } catch (Exception e) {
        }

        this.project.setName("Jane Doe");
        convertWithDefaultSettings(parsedProject2, "en").equals(convertedString);
    }

}