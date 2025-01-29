package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.jupiter.api.Test;

public class GeneratedBuild_URL {

    @Test
    public void build_URL() {
        String inputUrl = "https://example.com/path";
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        Uri uri = urlBuilder.build();
        assertNotNull(uri);
        assert !uri.isAbsolute();
        try {
            DataUtil.decode(uri.toString());
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}