package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseInvalidJsonTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseInvalidJsonTest() {
        String json = "{\"key\": \"invalid date\"}";
        transformer.parse(json, Project.class);
    }

}