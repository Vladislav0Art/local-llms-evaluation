package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        try {
            urlBuilder.appendKeyVal(kv);
        } catch (Exception e) {
            Assert.fail("Exception occurred in appendKeyValTest: " + e.getMessage());
        }
    }

}