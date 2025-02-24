package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildCorrectUrlTest {

    @Mock
    private URL inputUrl;

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void buildCorrectUrlTest() throws UnsupportedEncodingException, MalformedURLException {
        String encodedUrl = "https://example.com/path?key1=value1&key2=value2";
        String decodedUrl = "https://example.com/path?key1=value1&key2=value2";
        String key1 = "key1";
        String value1 = "value1";
        String key2 = "key2";
        String value2 = "value2";

        UrlBuilder builder = new UrlBuilder(new URL(decodedUrl));
        builder.appendKeyVal(new Connection.KeyVal(key1, value1));
        builder.appendKeyVal(new Connection.KeyVal(key2, value2));

        URL url = builder.build();

        assertEquals(encodedUrl, url.toString());
    }

}