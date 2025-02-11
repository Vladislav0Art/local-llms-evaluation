package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class GeneratedBuildWithPunyCodingAndNonAsciiPath TestUrlBuilderBuildWithPunyCodingAndNonAsciiPath {

    @Test
    public void buildWithPunyCodingAndNonAsciiPath

    TestUrlBuilderBuildWithPunyCodingAndNonAsciiPath() throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://a%20b.com/path%200utf8?c=d&e=f");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        URI uri = new URI(
                urlBuilder.u.getProtocol(),
                urlBuilder.u.getUserInfo(),
                IDN.toASCII(decodePart(urlBuilder.u.getHost())),
                urlBuilder.u.getPort(),
                decodePart(urlBuilder.u.getPath()),
                null, null
        );
        assertEquals("http://a%20b.com/path0utf8?c=d&e=f", uri.getScheme() + "://" + uri.getHost() + uri.getPath());
    }

}