package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetResponseWithMultipleKeys {

    @Test
    public void testGetResponseWithMultipleKeys() {
        Map<String, Object> response = new HashMap<>();
        response.put("key1", 1);
        response.put("key2", "value");

        String json = MyService.get("https://jsonplaceholder.typicode.com/posts/1")
                .getOrDefault(Maps.toString(), "\"\"");
        assertThat(json, is("{\"key1\":1,\"key2\":\"value\"}");
    }

}