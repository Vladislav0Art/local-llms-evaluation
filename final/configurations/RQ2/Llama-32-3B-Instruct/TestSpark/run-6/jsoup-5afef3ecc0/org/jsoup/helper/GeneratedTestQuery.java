package org.jsoup.helper;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

public class GeneratedTestQuery {

    @Test
    public void testQuery() throws Exception {
        String url = "https://example.com?a=1&b=2";
        URI uri = new URI(url);
        String query = uri.getQuery();
        assertThat(query, CoreMatchers.equalTo("a=1&b=2"));
    }

}