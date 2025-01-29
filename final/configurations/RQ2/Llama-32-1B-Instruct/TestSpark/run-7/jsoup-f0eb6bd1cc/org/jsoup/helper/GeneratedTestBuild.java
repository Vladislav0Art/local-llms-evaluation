package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.mockito.Mockito.*;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        String actualUrl = urlBuilder.build();
        URI actualUri = DataUtil.encode(actualUrl);
        assertEquals("https://example.com", actualUri.toString());
    }

}