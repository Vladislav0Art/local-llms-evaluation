package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;

public class GeneratedAppendKeyValToRef {

    @Test
    public void appendKeyValToRef() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://a.com?b=1#c"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.u.getRef());
        assertTrue(builder.u.getRef().equals("%20key=value"));
    }

}