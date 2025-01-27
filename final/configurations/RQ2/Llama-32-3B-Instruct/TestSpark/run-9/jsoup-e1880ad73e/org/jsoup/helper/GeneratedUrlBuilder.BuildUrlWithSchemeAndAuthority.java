package org.jsoup.helper;

import org.jsoup.helper.URL;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

public class GeneratedUrlBuilder.

BuildUrlWithSchemeAndAuthority {

    @Test
    public void urlBuilder.BuildUrlWithSchemeAndAuthority() {
        String scheme = "https";
        String authority = "example.com";
        assertEquals(scheme + ":" + authority, new UrlBuilder(new URL(scheme + "://" + authority)).build().getScheme() + "://" + new URL(scheme + "://" + authority).getHost());
    }

}