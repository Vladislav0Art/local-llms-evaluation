package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonTest {

    public static class TestItem {
        private final int id;
        private final String name;

        @JsonCreator
        public TestItem(@JsonProperty("id") int id, @JsonProperty("name") String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String jsonString = "{\"id\":1,\"name\":\"Item 1\"}";

        TestItem item = transformer.parse(jsonString, TestItem.class);

        Assert.assertEquals(1, item.getId());
        Assert.assertEquals("Item 1", item.getName());
    }

}