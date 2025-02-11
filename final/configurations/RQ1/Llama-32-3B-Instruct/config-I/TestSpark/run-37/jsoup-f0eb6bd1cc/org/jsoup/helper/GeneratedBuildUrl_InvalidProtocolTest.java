package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrl_InvalidProtocolTest {

    @Mock
    private Connection connection;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void buildUrl_InvalidProtocolTest() {
        when(connection.getHost()).thenReturn("example.com");
        URL inputUrl = new URL("http+://example.com/path?query=value#fragment");
        assertNull(urlBuilder.build());
    }

}