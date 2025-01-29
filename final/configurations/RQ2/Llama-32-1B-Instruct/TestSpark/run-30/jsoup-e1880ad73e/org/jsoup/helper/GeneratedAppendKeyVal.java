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

public class GeneratedAppendKeyVal {

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

}