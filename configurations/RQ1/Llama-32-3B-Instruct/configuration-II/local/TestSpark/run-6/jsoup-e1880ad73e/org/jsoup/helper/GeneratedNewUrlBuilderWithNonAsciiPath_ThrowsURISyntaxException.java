package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.regex.Pattern;

public class GeneratedNewUrlBuilderWithNonAsciiPath_ThrowsURISyntaxException {

    @Test
    public void newUrlBuilderWithNonAsciiPath_ThrowsURISyntaxException() throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://test.com/äöü?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        try {
            builder.build();
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
        }
    }

}