package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
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
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendKeyVal() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value", urlBuilder.q.toString());
    }

}