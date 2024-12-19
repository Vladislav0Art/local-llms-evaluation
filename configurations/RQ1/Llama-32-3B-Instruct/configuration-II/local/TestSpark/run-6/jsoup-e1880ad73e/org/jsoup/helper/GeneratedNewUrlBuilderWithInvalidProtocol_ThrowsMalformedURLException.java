package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.regex.Pattern;

public class GeneratedNewUrlBuilderWithInvalidProtocol_ThrowsMalformedURLException {

    @Test
    public void newUrlBuilderWithInvalidProtocol_ThrowsMalformedURLException() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("invalid://test.com/path?query=value#fragment"));
        try {
            builder.build();
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
        }
    }

}