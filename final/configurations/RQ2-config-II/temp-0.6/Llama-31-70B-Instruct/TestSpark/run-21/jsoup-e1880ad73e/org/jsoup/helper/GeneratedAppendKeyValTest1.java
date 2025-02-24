package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValTest1 {

    @Test
    public void appendKeyValTest1() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "val", Connection.KeyVal.Type.url);
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(keyVal);
        assertNotNull(inputUrl);
    }

}