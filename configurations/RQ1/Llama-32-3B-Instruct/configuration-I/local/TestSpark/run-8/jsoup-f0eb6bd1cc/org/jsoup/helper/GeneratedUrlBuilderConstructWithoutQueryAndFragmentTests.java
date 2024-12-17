package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedUrlBuilderConstructWithoutQueryAndFragmentTests {

    @Test
    public void urlBuilderConstructWithoutQueryAndFragmentTests() {
        URL u = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(u);
        assertNull(builder.q);
    }

}