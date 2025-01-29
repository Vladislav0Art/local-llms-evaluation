package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetResponse {

    @Test
    public void testGetResponse() {
        Map<String, Object> response = new HashMap<>();
        response.put("id", 1);
        response.put("title", "Hello World");
        response.put("body", "This is a demo post");

        String json = MyService.get("https://jsonplaceholder.typicode.com/posts/1").toString();
        assertThat(json, is("{\"id\":1,\"title\":\"Hello World\",\"body\":\"This is a demo post\"}");
    }

}