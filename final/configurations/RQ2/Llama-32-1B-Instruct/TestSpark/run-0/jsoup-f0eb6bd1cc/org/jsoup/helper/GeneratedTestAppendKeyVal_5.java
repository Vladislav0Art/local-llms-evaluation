package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyVal_5 {

    @Test
    public void testAppendKeyVal_5() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

}