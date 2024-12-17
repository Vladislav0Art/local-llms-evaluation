package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedUrlBuilderConstructWithQueryAndFragmentTests {

    @Test
    public void urlBuilderConstructWithQueryAndFragmentTests() {
        URL u = new URL("http://example.com?query=hello&fragment=world");
        UrlBuilder builder = new UrlBuilder(u);
        assertNotNull(builder.q);
    }

}