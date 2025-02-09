package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseInvalidJsonTest {

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        try {
            Project project = transformer.parse("{\"invalid key\":\"1234\"}", Project.class);
            Assert.fail("Should fail for invalid json input but it did not");
        } catch (HttpException e) {
            Assert.assertTrue(e instanceof CrowdinApiException);
        }
    }

}