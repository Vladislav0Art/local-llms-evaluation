package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildUrlReturnsSameUrlWhenNoParams {

    @Test
    public void buildUrlReturnsSameUrlWhenNoParams() throws MalformedURLException {
        URL url = new UrlBuilder("http://example.com").build();
        assertEquals("http://example.com", url.toString());
    }

}