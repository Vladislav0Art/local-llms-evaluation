package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseInvalidJsonTest {

    @Test
    public void parseInvalidJsonTest() {
        JsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String invalidJsonString = "{Invalid Json String}";
        jsonTransformer.parse(invalidJsonString, Project.class);
    }

}