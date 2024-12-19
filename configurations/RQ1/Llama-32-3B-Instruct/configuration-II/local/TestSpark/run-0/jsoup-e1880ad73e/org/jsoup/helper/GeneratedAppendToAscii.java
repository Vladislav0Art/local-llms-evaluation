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
public class GeneratedAppendToAscii {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendToAscii() {
        StringBuilder sb = new StringBuilder();
        String s = "ábcé";
        UrlBuilder.appendToAscii(s, false, sb);
        assertEquals("%C3%A1%C3%A6%C3%A7%C3%A8", sb.toString());
    }

}