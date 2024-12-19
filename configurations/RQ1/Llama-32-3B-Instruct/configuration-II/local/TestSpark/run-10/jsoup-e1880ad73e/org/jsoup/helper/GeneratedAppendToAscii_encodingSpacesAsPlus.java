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

public class GeneratedAppendToAscii_encodingSpacesAsPlus {

    @Test
    public void appendToAscii_encodingSpacesAsPlus() {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(" ", true, sb);
        assertEquals("%20", sb.toString());
    }

}