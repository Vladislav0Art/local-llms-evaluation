package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private UrlBuilder urlBuilder;
    @Mock
    private URL urlMock;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(urlMock);
    }

    @Test
    public void testBuild() {
        URL buildUrl = urlBuilder.build();
        assertNotNull(buildUrl);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        urlBuilder.appendKeyVal(null);
        verify(urlMock, times(1)).getQuery();
    }

    @Test
    public void testDecodePart() {
        String decodePart = urlBuilder.decodePart("encoded");
        assertNotNull(decodePart);
    }

    @Test
    public void testAppendToAscii() throws UnsupportedEncodingException {
        String appendToAscii = urlBuilder.appendToAscii("string", false, new StringBuilder());
        assertNotNull(appendToAscii);
    }

}