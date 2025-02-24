package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    // Mocks
    @Mock
    private URL inputUrl;

    @Mock
    private Connection.KeyVal kv;

    // Tests

    @Test
    public void buildTest() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        // Arrange
        when(inputUrl.toString()).thenReturn("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals(inputUrl, result);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn("value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals("key=value", urlBuilder.query());
    }

}