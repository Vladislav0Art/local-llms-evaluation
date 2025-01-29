package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    private JacksonJsonTransformer transformer;
    private String json;
    private Project project;
    private Project parsedProject;
    private String convertedString;
    private SparkRunner runner;

    @Before
    public void setup() {
        this.transformer = new JacksonJsonTransformer();
        this.json = "{\"name\":\"John Doe\",\"age\":30}";
        this.project = JsonTransformer.parse(json, Project.class);
        this.parsedProject = transformer.parse(json, Project.class);
        this.runner = new TestSparkRunner();
    }

}