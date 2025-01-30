package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL inputUrl = new URL("http://localhost/test?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("Should set URL to input URL", inputUrl, urlBuilder.u);
        assertEquals("Should set query string to URL query", "param1=value1", urlBuilder.q.toString());
    }

    @Test
    public void buildWithNoRefOrQueryTest() throws Exception {
        URL inputUrl = new URL("http://localhost/test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("Should return normalized URL", new URL("http://localhost/test"), urlBuilder.build());
    }

    @Test
    public void buildWithQueryTest() throws Exception {
        URL inputUrl = new URL("http://localhost/test?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("Should return normalized URL", new URL("http://localhost/test?param1=value1"), urlBuilder.build());
    }

    @Test
    public void buildWithQueryAndRefTest() throws Exception {
        URL inputUrl = new URL("http://localhost/test?param1=value1#ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("Should return normalized URL", new URL("http://localhost/test?param1=value1#ref"), urlBuilder.build());
    }

    @Test
    public void UrlBuilderConstructorWithQueryTest() throws Exception {
        URL inputUrl = new URL("http://example.com/path?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("URL should be set to input URL", inputUrl, urlBuilder.u);
        assertEquals("Query string should be set to URL query", "param1=value1", urlBuilder.q.toString());
    }

    @Test
    public void UrlBuilderConstructorWithoutQueryTest() throws Exception {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("URL should be set to input URL", inputUrl, urlBuilder.u);
        assertNull("Query string should be null", urlBuilder.q);
    }

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("http://example.com/path?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertEquals("The output URL should maintain the same structure", inputUrl, result);
    }

    @Test
    public void UrlBuilderConstructorWithQueryTest() throws Exception {
        URL inputUrl = new URL("http://example.com/path?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("URL should be same as input URL", inputUrl, urlBuilder.u);
        assertEquals("Query string should be same as URL query", "param1=value1", urlBuilder.q.toString());
    }

    @Test
    public void UrlBuilderConstructorWithoutQueryTest() throws Exception {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("URL should be same as input URL", inputUrl, urlBuilder.u);
        assertNull("Query string should be null", urlBuilder.q);
    }

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("http://example.com/path?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertEquals("Output URL should maintain original structure.", inputUrl, result);
    }

}