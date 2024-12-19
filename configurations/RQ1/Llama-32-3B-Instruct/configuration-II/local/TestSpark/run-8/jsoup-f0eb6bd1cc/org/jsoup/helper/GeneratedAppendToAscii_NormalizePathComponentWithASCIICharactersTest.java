package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedAppendToAscii_NormalizePathComponentWithASCIICharactersTest {

    @Test
    public void appendToAscii_NormalizePathComponentWithASCIICharactersTest() {
        StringBuilder sb = new StringBuilder();
        String path = "Hello World!";
        UrlBuilder.appendToAscii(path, false, sb);
        // Test expected normalized path component
    }

}