package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class GeneratedBuildUrlFromEmptyString Test {

    @Test
    public void buildUrlFromEmptyString

    Test() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(new URL("")));
    }

}