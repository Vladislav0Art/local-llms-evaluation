package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedUrlBuilderDecodePartTest {

    @Test
    public void urlBuilderDecodePartTest() throws UnsupportedEncodingException {
        String encoded = "äöü";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("äöü", decoded);
    }

}