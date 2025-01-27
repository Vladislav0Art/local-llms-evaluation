package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuild_url_from_empty_url {

    @Test
    public void build_url_from_empty_url() {
        URL url = null;
        String expectedUrl = "";
        assertEquals(expectedUrl, new UrlBuilder(url).build());
    }

}