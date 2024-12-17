package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.HashMap;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        URL result = urlBuilder.build();
        assert result.getScheme() != null && !result.getProtocol().isEmpty() || result.getHost() == null;
    }

}