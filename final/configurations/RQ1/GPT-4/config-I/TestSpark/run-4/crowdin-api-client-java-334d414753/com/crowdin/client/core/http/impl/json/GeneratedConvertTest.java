package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertTest() {
        TestClass object = new TestClass();
        object.setKey("valid");
        String convertedString = transformer.convert(object);
        Assert.assertTrue(convertedString.contains("\"key\":\"valid\""));
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