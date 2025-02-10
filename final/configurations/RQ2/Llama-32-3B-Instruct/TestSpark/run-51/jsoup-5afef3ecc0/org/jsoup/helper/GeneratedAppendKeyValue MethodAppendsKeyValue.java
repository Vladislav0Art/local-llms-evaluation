package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedAppendKeyValue MethodAppendsKeyValue {

    @Mock
    private URL url;

    @Test
    public void appendKeyValue

    MethodAppendsKeyValue() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assertEquals("key=value", URLDecoder.decode(urlBuilder.appendKeyVal(Connection.KeyVal.valueOf("key", "value")).toString(), UTF_8));
    }

}