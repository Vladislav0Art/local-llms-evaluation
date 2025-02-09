package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertNullObjectTest {

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = transformer.convert((Project) null);
        Assert.assertEquals("null", json);
    }

}