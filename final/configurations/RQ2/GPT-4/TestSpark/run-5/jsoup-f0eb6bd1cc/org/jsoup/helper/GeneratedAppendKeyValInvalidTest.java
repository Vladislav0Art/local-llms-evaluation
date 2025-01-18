package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedAppendKeyValInvalidTest {

    @Test
    public void appendKeyValInvalidTest() {
        try {
            URL inputUrl = new URL("https://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal keyVal = new Connection.KeyVal("ke¥", "value");
            urlBuilder.appendKeyVal(keyVal);
        } catch (MalformedURLException e) {
            Assert.fail(e.getMessage());
        } catch (UnsupportedEncodingException ignored) {

        }
    }

}