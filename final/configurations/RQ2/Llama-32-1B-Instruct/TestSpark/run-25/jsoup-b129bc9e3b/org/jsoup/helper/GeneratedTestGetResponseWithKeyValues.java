package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetResponseWithKeyValues {

    @Test
    public void testGetResponseWithKeyValues() {
        Map<String, Object> response = new HashMap<>();
        response.put("key", "value");

        String json = MyService.get("https://jsonplaceholder.typicode.com/posts/1")
                .getOrDefault(Maps.toString(), "\"\"");
        assertThat(json, is("{\"key\":\"value\"}");
    }

}