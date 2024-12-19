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

public class GeneratedAppendMultipleKeyVal {

    @Test
    public void appendMultipleKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL(""));
        List<KeyVal> keyVals = new ArrayList<>();
        keyVals.add(new KeyVal("key1", "val1"));
        keyVals.add(new KeyVal("key2", "val2"));
        builder.appendKeyVal(keyVals);
        assertEquals("key1=val1&key2=val2", builder.build().toString(), false);
    }

}