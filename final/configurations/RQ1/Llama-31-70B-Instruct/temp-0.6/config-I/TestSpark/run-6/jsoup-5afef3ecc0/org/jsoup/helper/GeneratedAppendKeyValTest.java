package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Mock
    private URL inputUrl;

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

}