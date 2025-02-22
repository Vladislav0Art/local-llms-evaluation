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
public class GeneratedTestDecodePart {

    private UrlBuilder urlBuilder;
    @Mock
    private URL urlMock;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(urlMock);
    }

    @Test
    public void testDecodePart() {
        String decodePart = urlBuilder.decodePart("encoded");
        assertNotNull(decodePart);
    }

}