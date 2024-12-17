package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendToAscii_[SpaceAsPlus]

Test {

    @Test
    public void appendToAscii_[ SpaceAsPlus]Test() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder("ä ö ");
        UrlBuilder.appendToAscii(sb, true, null);
        assertEquals("%E4%E6 %20", sb.toString());
    }

}