package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_EmptyUrlReturnsSame {

    @Mock
    private Connection connection;

    @Mock
    private String encodedUrl;

    @Test
    public void appendKeyVal_EmptyUrlReturnsSame() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", "value"));
        URL result = urlBuilder.build();
        assertEquals(null, result);
    }

}