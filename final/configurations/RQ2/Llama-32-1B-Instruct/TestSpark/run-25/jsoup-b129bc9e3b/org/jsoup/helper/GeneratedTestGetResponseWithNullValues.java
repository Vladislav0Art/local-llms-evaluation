package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetResponseWithNullValues {

    @Test
    public void testGetResponseWithNullValues() {
        Map<String, Object> response = new HashMap<>();
        response.put("null", "default value");

        String json = MyService.get("https://jsonplaceholder.typicode.com/posts/1").getOrDefault("", "\"\"");
        assertThat(json, is("\"\"");
    }

}