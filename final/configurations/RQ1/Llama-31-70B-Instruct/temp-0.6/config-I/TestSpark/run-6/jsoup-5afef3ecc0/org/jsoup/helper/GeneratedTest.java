package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Mock
    private URL inputUrl;

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        // Arrange
        MockitoAnnotations.initMocks(this);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        URL result = builder.build();

        // Assert
        assertNotNull(result);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        MockitoAnnotations.initMocks(this);
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        // Act
        builder.appendKeyVal(kv);

        // Assert
        assertNotNull(builder.q);
    }

    @Test
    public void normalizeQueryTest() {
        // Arrange
        String q = "a b c";

        // Act
        String result = UrlBuilder.normalizeQuery(q);

        // Assert
        assertEquals("a+b+c", result);
    }

    @Test
    public void normalizeRefTest() {
        // Arrange
        String r = "a b c";

        // Act
        String result = UrlBuilder.normalizeRef(r);

        // Assert
        assertEquals("a%20b%20c", result);
    }

}