package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.SpyBean;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePart {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private StringUtil stringUtil;

    @SpyBean
    private UrlBuilder urlBuilder;

    @Test
    public void decodePart() {
        // Arrange and Act
        String decoded = UrlBuilder.decodePart("http%2F%2Fexample.com");
        assertEquals("http://example.com", decoded);
    }

}