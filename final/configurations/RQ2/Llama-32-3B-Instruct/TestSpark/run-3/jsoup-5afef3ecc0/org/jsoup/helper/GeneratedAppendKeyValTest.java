package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        new UrlBuilder(new URL("http://www.test.com")).appendKeyVal(kv);
        assertEquals("key=value", StringUtil.getValue(kv));
    }

}