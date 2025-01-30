package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithMultipleQueriesTest {

    private Connection.KeyVal mockKeyVal(String key, String value) {
        return new Connection.KeyVal() {
            @Override
            public String key() {
                return key;
            }

            @Override
            public String value() {
                return value;
            }

            @Override
            public Connection.KeyVal key(String key) {
                return this;
            }

            @Override
            public Connection.KeyVal value(String value) {
                return this;
            }

            @Override
            public String contentType() {
                return null;
            }

            @Override
            public Connection.KeyVal contentType(String contentType) {
                return this;
            }
        };
    }

    @Test
    public void buildWithMultipleQueriesTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(mockKeyVal("name1", "value1"));
        urlBuilder.appendKeyVal(mockKeyVal("name2", "value2"));
        assertEquals(new URL("http://www.example.com?name1=value1&name2=value2"), urlBuilder.build());
    }

}