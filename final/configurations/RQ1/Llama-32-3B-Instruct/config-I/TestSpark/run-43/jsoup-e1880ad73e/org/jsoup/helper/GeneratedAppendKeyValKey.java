package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyValKey {

    @Test
    public void appendKeyValKey() {
        Connection.KeyVal kv = new Connection.KeyVal("a", "b");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        try {
            urlBuilder.appendKeyVal(kv);
            fail();
        } catch (UnsupportedEncodingException e) {
        }
    }

}