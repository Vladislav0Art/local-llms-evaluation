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
public class GeneratedDecodePartWithUnsupportedEncoding {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private StringUtil stringUtil;

    @SpyBean
    private UrlBuilder urlBuilder;

    @Test
    public void decodePartWithUnsupportedEncoding() {
        // Arrange and Act
        UrlBuilder.decodePart("http%2F%2Fexample.com", null, null);
    }

}