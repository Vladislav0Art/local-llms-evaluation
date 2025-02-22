package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_WithKeyVal_AppendsToQuery {

    private UrlBuilder urlBuilder;

    @Mock
    private URL mockUrl;

    @Before
    public void setUp() throws MalformedURLException {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void appendKeyVal_WithKeyVal_AppendsToQuery() throws Exception {
        // Arrange
        Connection.KeyVal keyVal = new Connection.KeyVal("key1", "value1");

        // Act
        urlBuilder.appendKeyVal(keyVal);

        // Assert
        assertEquals("key1=value1", urlBuilder.q.toString());
    }

}