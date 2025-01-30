package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertInvalidObjectTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertInvalidObjectTest() {
        Object object = new Object();
        transformer.convert(object);
    }

    public static class TestClass {

        private String key;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

}