package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GeneratedAppendKeyValWithInvalidEncodingTest {

    @Test
    public void appendKeyValWithInvalidEncodingTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = Connection.KeyVal.create("key1", "val2");
        urlBuilder.appendKeyVal(keyVal);
    }

}