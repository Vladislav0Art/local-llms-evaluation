package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class GeneratedBuildUrlTest {

    @Test
    public void buildUrlTest() {
        new UrlBuilder(new URL("http://www.test.com"));
    }

}