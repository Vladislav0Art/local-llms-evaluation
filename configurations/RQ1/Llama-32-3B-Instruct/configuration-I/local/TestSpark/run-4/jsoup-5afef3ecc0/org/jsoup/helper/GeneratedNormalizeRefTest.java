package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() {
        String r = "#123";
        String normalizedR = UrlBuilder.normalizeRef(r);
        assertEquals("%20%23123", normalizedR);
    }
}

public class UrlBuilder {

    URL u;
    StringBuilder q;

    public UrlBuilder(URL inputUrl) {
        this.u = inputUrl;
        if (u.getQuery() != null)
            q = StringUtil.borrowBuilder().append(u.getQuery());
    }

    public URL build() {
        try {
            URI uri = new URI(
                    u.getProtocol(),
                    u.getUserInfo(),
                    IDN.toASCII(decodePart(u.getHost())),
                    u.getPort(),
                    decodePart(u.getPath()),
                    null, null // query and fragment appended later so as not to encode
            );

            String normUrl = uri.toASCIIString();
            if (q != null || u.getRef() != null) {
                StringBuilder sb = StringUtil.borrowBuilder().append(normUrl);
                if (q != null) {
                    sb.append('?');
                    sb.append(normalizeQuery(StringUtil.releaseBuilder(q)));
                }
                if (u.getRef() != null) {
                    sb.append('#');
                    sb.append(normalizeRef(u.getRef()));
                }
                normUrl = StringUtil.releaseBuilder(sb);
            }
            u = new URL(normUrl);
            return u;
        } catch (MalformedURLException | URISyntaxException e) {
            assert Validate.assertFail(e.toString());
            return u;
        }
    }

    public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
        if (q == null)
            q = StringUtil.borrowBuilder();
        else
            q.append('&');
        q
                .append(URLEncoder.encode(kv.key(), UTF_8.name()))
                .append('=')
                .append(URLEncoder.encode(kv.value(), UTF_8.name()));
    }

    private static String decodePart(String encoded) {
        try {
            return URLDecoder.decode(encoded, UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static String normalizeQuery(String q) {
        // minimal space normal; other characters left as supplied - if generated from jsoup data, will be encoded
        return q.replace(' ', '+');
    }

    private static String normalizeRef(String r) {
        // minimal space normal; other characters left as supplied
        return r.replace(" ", "%20");
    }

}