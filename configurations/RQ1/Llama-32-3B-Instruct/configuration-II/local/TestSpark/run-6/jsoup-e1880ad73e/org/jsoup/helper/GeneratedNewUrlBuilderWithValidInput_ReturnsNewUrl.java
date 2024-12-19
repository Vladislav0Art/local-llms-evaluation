package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.regex.Pattern;

public class GeneratedNewUrlBuilderWithValidInput_ReturnsNewUrl {

    @Test
    public void newUrlBuilderWithValidInput_ReturnsNewUrl() throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://test.com/path?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        assertSame(builder.u, new URL(builder.build()));
    }

}