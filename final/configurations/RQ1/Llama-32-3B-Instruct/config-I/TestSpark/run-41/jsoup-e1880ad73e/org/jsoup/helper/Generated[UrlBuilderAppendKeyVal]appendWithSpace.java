package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class Generated[UrlBuilderAppendKeyVal]

appendWithSpace {

    @Test
    public void [UrlBuilderAppendKeyVal]appendWithSpace() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal();

        builder.appendKeyVal(kv1);
        assertEquals('?k1=v1+k2=v2', builder.q.toString());
    }

}