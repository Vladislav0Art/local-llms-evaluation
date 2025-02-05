package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseInvalidObjectTypeTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseInvalidObjectTypeTest() {
        String json = "{\"name\":\"TestProject\"}";

        FileInfo result = jacksonJsonTransformer.parse(json, FileInfo.class);

        Assert.assertNull(result);
    }

}