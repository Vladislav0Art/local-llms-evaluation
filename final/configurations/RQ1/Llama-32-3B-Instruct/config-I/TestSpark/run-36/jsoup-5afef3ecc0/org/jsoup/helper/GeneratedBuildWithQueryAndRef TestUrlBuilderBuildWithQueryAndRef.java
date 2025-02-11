package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedBuildWithQueryAndRef TestUrlBuilderBuildWithQueryAndRef {

    @Test
    public void buildWithQueryAndRef

    TestUrlBuilderBuildWithQueryAndRef() throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://a%20b.com?c=d&e=f#h");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        URI uri = new URI(
                urlBuilder.u.getProtocol(),
                urlBuilder.u.getUserInfo(),
                IDN.toASCII(decodePart(urlBuilder.u.getHost())),
                urlBuilder.u.getPort(),
                decodePart(urlBuilder.u.getPath()),
                null, null
        );
        assertEquals("http://a%20b.com?c=d&e=f#h", uri.getScheme() + "://" + uri.getHost() + uri.getPath());
    }

}