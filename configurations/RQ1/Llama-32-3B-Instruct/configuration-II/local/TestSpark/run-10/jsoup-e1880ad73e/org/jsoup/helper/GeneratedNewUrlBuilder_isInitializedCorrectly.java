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

public class GeneratedNewUrlBuilder_isInitializedCorrectly {

    @Test
    public void newUrlBuilder_isInitializedCorrectly() {
        URL inputUrl = new URL("https://example.com/path?query=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.u);
        assertNull(urlBuilder.q);
    }

}