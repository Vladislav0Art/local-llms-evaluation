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

public class GeneratedAppendToAscii_NormalizePathComponentWithNonASCIICharactersTest {

    @Test
    public void appendToAscii_NormalizePathComponentWithNonASCIICharactersTest() {
        StringBuilder sb = new StringBuilder();
        String path = "\u00A0\u00B1";
        UrlBuilder.appendToAscii(path, true, sb);
        // Test expected normalized path component
    }

}