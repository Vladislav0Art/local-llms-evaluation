package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.regex.Pattern;

public class GeneratedBuildWithNonAsciiCharacter_ReturnsSameUrl {

    @Test
    public void buildWithNonAsciiCharacter_ReturnsSameUrl() throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://test.com/äöü?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        assertSame(builder.u, new URL(builder.build()));
    }

}