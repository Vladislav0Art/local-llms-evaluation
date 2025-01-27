package org.jsoup.helper;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

public class GeneratedTestUri {

    @Test
    public void testUri() throws Exception {
        String url = "https://example.com?a=1&b=2";
        URI uri = new URI(url);
        assertThat(uri, CoreMatchers.equalTo(new URI("https://example.com?a=1&b=2")));
    }

}