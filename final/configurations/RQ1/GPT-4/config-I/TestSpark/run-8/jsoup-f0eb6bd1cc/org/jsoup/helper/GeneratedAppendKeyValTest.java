package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;

public class GeneratedAppendKeyValTest {


    class TestKeyVal implements Connection.KeyVal {

        private String key;
        private String value;

        public TestKeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String key() {
            return key;
        }

        @Override
        public Connection.KeyVal key(String key) {
            this.key = key;
            return this;
        }

        @Override
        public String value() {
            return value;
        }

        @Override
        public Connection.KeyVal value(String value) {
            this.value = value;
            return this;
        }
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = new TestKeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        Assert.assertEquals("key=value", urlBuilder.q.toString());
    }

}