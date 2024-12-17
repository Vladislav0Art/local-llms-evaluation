package org.jsoup.helper;

import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder.UnsupportedEncodingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAppendNullKeyVal {

    @Test
    public void appendNullKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(""));
        List<KeyVal> keyVals = new ArrayList<>();
        keyVals.add(null);
        assertNull(builder.build());
    }

}