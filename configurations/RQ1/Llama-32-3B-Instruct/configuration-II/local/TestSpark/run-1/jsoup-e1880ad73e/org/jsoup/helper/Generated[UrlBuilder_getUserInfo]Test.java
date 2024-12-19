package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class Generated[UrlBuilder_getUserInfo]

Test {

    @Test
    public void [UrlBuilder_getUserInfo]Test() {
        String url = "http://user:pass@example.com/path?query=value";
        String expectedUserInfo = "user:pass";
        UrlBuilder builder = new UrlBuilder(new URL(url));
        assertEquals(expectedUserInfo, builder.u.getUserInfo());
    }

}