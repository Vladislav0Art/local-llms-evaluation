package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.nio.charset.Charset;

public class GeneratedDecodePartValidInputTest {

    @Test
    public void decodePartValidInputTest() throws Exception {
        String encoded = "test";
        String result = UrlBuilder.decodePart(encoded);
        Assert.assertEquals(result, encoded);
    }

}