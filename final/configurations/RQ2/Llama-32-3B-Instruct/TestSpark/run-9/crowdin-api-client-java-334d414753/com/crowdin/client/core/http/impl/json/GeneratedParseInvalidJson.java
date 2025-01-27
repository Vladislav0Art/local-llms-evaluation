package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseInvalidJson {

    @Test
    public void parseInvalidJson() {
        // Arrange
        String json = "{\" invalid \":\"json\"}";
        Class<Project> clazz = Project.class;

        // Act
        new JacksonJsonTransformer().parse(json, clazz);
    }

}