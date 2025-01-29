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

public class GeneratedTest {

    @Test
    public void buildUrls() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        URL url = UrlBuilder.build(inputUrl);
        assertThat(url.getProtocol()).isEqualTo("https");
        assertThat(url.getHost()).isEqualTo("example.com");
        assertThat(url.getPath()).isEqualTo("/path");
        assertThat(url.getQuery()).isEqualTo("?param1=value1&param2=value2");
    }

    @Test
    public void appendKeyVal() {
        URLBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("param1", "value1");
            put("param2", "value2");
        }});
        String encodedUrl = encodeUrl(builder.build());
        assertThat(encodedUrl).isEqualTo("https://example.com/path?param1=value1&param2=value2");
    }

    @Test
    public void appendKeyVal_NonEmptyParams() {
        URLBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("param1", "value1");
        }});
        String encodedUrl = encodeUrl(builder.build());
        assertThat(encodedUrl).isEqualTo("https://example.com/path?param1=value1");
    }

    @Test
    public void appendKeyVal_NonEmptyParams_DupeKey() {
        URLBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("param1", "value1");
            put("param2", "value2");
        }});
        String encodedUrl = encodeUrl(builder.build());
        assertThat(encodedUrl).isEqualTo("https://example.com/path?param1=value1&param2=value2");
    }

    @Test
    public void appendKeyVal_NonEmptyParams_ExistingKey() {
        URLBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
        builder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("existing_key", "value1");
            put("param1", "value1");
        }});
        String encodedUrl = encodeUrl(builder.build());
        assertThat(encodedUrl).isEqualTo("https://example.com/path?existing_key=value1&param1=value1");
    }

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