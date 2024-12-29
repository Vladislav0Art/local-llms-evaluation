package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNullJsonTest {

    @Test
    public void parseNullJsonTest() {
        JsonTransformer jsonTransformer = new JacksonJsonTransformer();
        jsonTransformer.parse(null, Project.class);
    }

}