package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("http://www.example.com/");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = new Connection.KeyVal("key", "value");
            builder.appendKeyVal(kv);
            URL outputUrl = builder.build();
            assertTrue(outputUrl.toString().contains("?key=value"));
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }

}