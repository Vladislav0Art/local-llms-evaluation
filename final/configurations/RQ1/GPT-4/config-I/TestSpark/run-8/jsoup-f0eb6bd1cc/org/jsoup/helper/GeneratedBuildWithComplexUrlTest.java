package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.URL;

public class GeneratedBuildWithComplexUrlTest {


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
    public void buildWithComplexUrlTest() throws Exception {
        URL url = new URL("http://test.com/test.php?name=kitty&color=blue#header");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        Assert.assertEquals("http://test.com/test.php?name=kitty&color=blue#header", result.toString());
    }

}