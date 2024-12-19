package org.jsoup.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class GeneratedTestNormalizePath {

    private final UrlBuilder urlBuilder = new UrlBuilder(null);

    @BeforeEach
    public void setUp() {
        String inputUrl1 = "https://example.com/path?query=value#fragment";
        String inputUrl2 = "https://example.com/path%20with%20spaces";

        URL u1 = urlBuilder.build();
        URL u2 = urlBuilder.build();

        assert u1 != null;
        assert !u1.getQuery().isEmpty();
        assertEquals(u1, u2);
    }

    @Test
    public void testNormalizePath() throws URISyntaxException {
        String path = "path%20with%20spaces";
        URI uri = new URI(
                u.getProtocol(),
                u.getUserInfo(),
                IDN.toASCII(path), // puny-code
                u.getPort(),
                encodePath(uri.getPath()),
                null, null // query and fragment appended later so as not to encode
        );
        assertEquals("path%20with%20spaces", uri.toString());
    }

    private String decodePart(String encoded) {
        try {
            return URLDecoder.decode(encoded, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e); // wtf!
        }
    }

}