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

public class GeneratedBuild_throwsOnInvalidURL {

    @Test
    public void build_throwsOnInvalidURL() {
        URL invalidUrl = new URL("https://example.com/path?query=invalid");
        UrlBuilder urlBuilder = new UrlBuilder(invalidUrl);
        urlBuilder.build();
    }

}