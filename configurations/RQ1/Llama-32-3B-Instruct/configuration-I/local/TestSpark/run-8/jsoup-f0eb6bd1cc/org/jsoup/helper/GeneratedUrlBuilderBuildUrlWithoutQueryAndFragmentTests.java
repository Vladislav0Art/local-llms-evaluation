package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedUrlBuilderBuildUrlWithoutQueryAndFragmentTests {

    @Test
    public void urlBuilderBuildUrlWithoutQueryAndFragmentTests() {
        URL u = new URL("http://example.com/path/to/resource");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com/ path%2Fto%2Fresource", builder.u.toString());
    }

}