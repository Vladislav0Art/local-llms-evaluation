package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class Generated[UrlBuilder_build]

Test {

    @Test
    public void [UrlBuilder_build]Test() {
        String url = "http://example.com/path?query=value";
        URL expectedU = new URL("http://" + "example.com" + "/path");
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedU, builder.u);
    }

}