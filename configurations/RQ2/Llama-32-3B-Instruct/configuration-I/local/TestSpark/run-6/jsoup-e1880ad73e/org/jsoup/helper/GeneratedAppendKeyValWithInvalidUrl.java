package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.net.URL;

@RunWith(PowerMockRunner.class)
public class GeneratedAppendKeyValWithInvalidUrl {

    @Test
    public void appendKeyValWithInvalidUrl() {
        try {
            UrlBuilder urlBuilder = new UrlBuilder(null);
            urlBuilder.appendKeyVal(new Connection.KeyVal());
            assertTrue(false, "Expected UnsupportedEncodingException to be thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}