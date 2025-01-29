package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.model_urls.URL;
import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedAppendKeyVal_NullKey {

    @Test
    public void appendKeyVal_NullKey() {
        URLBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(null);
        String encodedUrl = encodeUrl(builder.build());
        assertThat(encodedUrl).isEqualTo("https://example.com/path");
    }

    private String encodeUrl(URL url) {
        try {
            return URLEncoder.encode(url.toString(), UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

}