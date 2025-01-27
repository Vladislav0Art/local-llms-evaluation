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

public class GeneratedAppendKeyVal {

    @Mock
    Connection connection;

    @Mock
    private URL inputUrl;

    @InjectMocks
    UrlBuilder urlBuilder;

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal();
        urlBuilder.appendKeyVal(kv);
        assertNotNull(kv.getKey());
        assertEquals(UTF_8, kv.getValue());
    }

}