package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

public class GeneratedCreateUrlBuilder_buildsUrlWithoutFragmentWhenNoFragmentIsPresent {

    @Test
    public void createUrlBuilder_buildsUrlWithoutFragmentWhenNoFragmentIsPresent() {
        URL url = new URL("https://example.com/path?query=string#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("https://example.com/path?query=string", urlBuilder.build().toString());
    }

}