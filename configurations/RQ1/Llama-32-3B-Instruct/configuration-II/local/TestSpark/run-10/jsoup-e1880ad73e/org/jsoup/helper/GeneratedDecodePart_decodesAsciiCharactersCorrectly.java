package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.concurrent.atomic.AtomicBoolean;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.*;

public class GeneratedDecodePart_decodesAsciiCharactersCorrectly {

    @Test
    public void decodePart_decodesAsciiCharactersCorrectly() {
        String encoded = "hello world";
        assertEquals("hello world", UrlBuilder.decodePart(encoded));
    }

}