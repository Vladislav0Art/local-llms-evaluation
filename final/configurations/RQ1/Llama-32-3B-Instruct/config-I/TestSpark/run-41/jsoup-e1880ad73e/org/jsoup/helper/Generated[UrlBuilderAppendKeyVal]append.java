package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class Generated[UrlBuilderAppendKeyVal]

append {

    @Test
    public void [UrlBuilderAppendKeyVal]append() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal();
        Connection.KeyVal kv2 = new Connection.KeyVal();

        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);

        assertEquals('?k1=v1&k2=v2', builder.q.toString());
    }

}