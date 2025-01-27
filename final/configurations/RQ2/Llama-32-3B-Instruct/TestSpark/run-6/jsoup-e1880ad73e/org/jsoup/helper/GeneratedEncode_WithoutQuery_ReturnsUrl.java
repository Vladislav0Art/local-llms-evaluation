package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEncode_WithoutQuery_ReturnsUrl {

    @Test
    public void encode_WithoutQuery_ReturnsUrl() throws UnsupportedEncodingException {
        URL url = new UrlBuilder(null);
        String path = "path";
        url = url.path(path).build();
        // No encoding needed for path
    }

}