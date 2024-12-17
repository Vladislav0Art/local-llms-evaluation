package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedAppend_to_ascii_space_not_as_plus_test {

    @Test
    public void append_to_ascii_space_not_as_plus_test() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.UrlBuilderTestHelper.appendToAscii(sb, false, "path/àb/cèd");
        assertEquals("path/%20%C3%80%C3%82%C3%A9%C3%B4%C3%83%C3%85%C3%86%C3%87", sb.toString());
    }
}

class UrlBuilderTestHelper {
    public static void buildNormalizing(UrlBuilder ub, String path, String uriEncoding, int port) throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://" + IDN.toASCII(path), null, port);
        ub.u = u;
        if (uriEncoding.equals("utf-8")) {
            URI uri = new URI(
                    u.getProtocol(),
                    u.getUserInfo(),
                    IDN.toASCII(decodePart(u.getHost())), // puny-code
                    u.getPort(),
                    decodePart(u.getPath()),
                    null, null // query and fragment appended later so as not to encode
            );
            ub.q = StringUtil.borrowBuilder().append(uri.toASCIIString());
        }
    }

    public static void appendToAscii(StringBuilder sb, boolean spaceAsPlus, String s) throws UnsupportedEncodingException {
        for (int i = 0; i < s.length(); i++) {
            int c = s.codePointAt(i);
            if (c == ' ') {
                sb.append(spaceAsPlus ? '+' : "%20");
            } else if (c > 127) { // out of ascii range
                sb.append(URLEncoder.encode(new String(Character.toChars(c)), UTF_8.name()));
                // ^^ is a bit heavy-handed - if perf critical, we could optimize
            } else {
                sb.append((char) c);
            }
        }
    }

}