package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetResponseWithEmptyStringValues {

    @Test
    public void testGetResponseWithEmptyStringValues() {
        Map<String, Object> response = new HashMap<>();
        response.put("", "default value");

        String json = MyService.get("https://jsonplaceholder.typicode.com/posts/1").getOrDefault("", "default value");
        assertThat(json, is("default value"));
    }

}