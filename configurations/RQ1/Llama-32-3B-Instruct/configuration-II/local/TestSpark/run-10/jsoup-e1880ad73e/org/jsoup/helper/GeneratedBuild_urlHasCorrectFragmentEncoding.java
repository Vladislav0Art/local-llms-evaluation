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

public class GeneratedBuild_urlHasCorrectFragmentEncoding {

    @Test
    public void build_urlHasCorrectFragmentEncoding() {
        URL inputUrl = new URL("https://example.com/path?query=value#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String normUrl = urlBuilder.build().toString();
        assertTrue(normUrl.contains("#"));
        String[] fragmentParts = normUrl.split("#");
        assertEquals(2, fragmentParts.length);
    }

}