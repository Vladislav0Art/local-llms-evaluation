package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyValEmptyUrl {

    @Test
    public void appendKeyValEmptyUrl() {
        Connection.KeyVal kv = new Connection.KeyVal("", "");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        StringBuilder q = new StringBuilder();
        try {
            urlBuilder.appendKeyVal(kv);
            fail();
        } catch (UnsupportedEncodingException e) {
        }
    }

}