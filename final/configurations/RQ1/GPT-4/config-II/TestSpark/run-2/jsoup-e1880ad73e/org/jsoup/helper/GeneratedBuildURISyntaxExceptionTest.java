package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedBuildURISyntaxExceptionTest {

    @Test
    public void buildURISyntaxExceptionTest() throws Exception {
        URL inputUrl = new URL("http:\\\\google.com"); // Invalid URL
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.build(); // This should throw URISyntaxException
    }

}