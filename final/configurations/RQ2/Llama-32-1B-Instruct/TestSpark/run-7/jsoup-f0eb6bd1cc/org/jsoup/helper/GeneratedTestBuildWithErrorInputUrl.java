package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.mockito.Mockito.*;

public class GeneratedTestBuildWithErrorInputUrl {

    @Test
    public void testBuildWithErrorInputUrl() {
        URLBuilder builder = new UrlBuilder(null);
        try {
            builder.build();
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
        }
    }

}