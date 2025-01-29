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

public class GeneratedBuildUrls {

    @Test
    public void buildUrls() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        URL url = UrlBuilder.build(inputUrl);
        assertThat(url.getProtocol()).isEqualTo("https");
        assertThat(url.getHost()).isEqualTo("example.com");
        assertThat(url.getPath()).isEqualTo("/path");
        assertThat(url.getQuery()).isEqualTo("?param1=value1&param2=value2");
    }

}