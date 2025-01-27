package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedAppendKeyValMultipleTimes {

    @Mock
    Connection connection;

    @Mock
    private URL inputUrl;

    @InjectMocks
    UrlBuilder urlBuilder;

    @Test
    public void appendKeyValMultipleTimes() {
        Connection.KeyVal kv1 = new Connection.KeyVal();
        Connection.KeyVal kv2 = new Connection.KeyVal();
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);
        assertNotNull(kv1.getKey());
        assertEquals(UTF_8, kv1.getValue());
        assertNotNull(kv2.getKey());
        assertEquals(UTF_8, kv2.getValue());
    }

}