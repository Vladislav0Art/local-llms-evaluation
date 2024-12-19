package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Generated[MethodUnderTest]

Test_build {

    @Test
    public void [MethodUnderTest]Test_build() {
        String inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URI uri = urlBuilder.build();
        assertNotNull(uri);
    }

}