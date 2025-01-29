package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestConvertString {

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
    public void testConvertString() {
        when(this.transformer.withDefaultSettings()).thenReturn(this.converter);
        JacksonJsonTransformer convertWithDefaultSettings = JacksonJsonTransformer.withDefaultSettings(transformer);
        String convertedString2 = convertWithDefaultSettings.convert(json);
        assertEquals("John Doe", convertedString);

        Project parsedProject4 = this.converter.parse(convertedString).getProjects()[0];
        assertEquals(project.getName(), "Jane Doe");
        assertEquals(project.getAge(), 30);
    }

}