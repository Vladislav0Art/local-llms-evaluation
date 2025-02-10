package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedUrlBuilderConstructorsTest {

    @Test
    public void urlBuilderConstructorsTest() {
        assertTrue(UrlBuilder.class.isInstance(new UrlBuilder(null)));
    }

}