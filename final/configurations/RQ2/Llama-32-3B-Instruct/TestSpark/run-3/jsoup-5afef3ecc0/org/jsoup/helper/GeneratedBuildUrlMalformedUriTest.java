package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class GeneratedBuildUrlMalformedUriTest {

    @Test
    public void buildUrlMalformedUriTest() {
        new UrlBuilder(new URL("invalid://test.com"));
    }

}