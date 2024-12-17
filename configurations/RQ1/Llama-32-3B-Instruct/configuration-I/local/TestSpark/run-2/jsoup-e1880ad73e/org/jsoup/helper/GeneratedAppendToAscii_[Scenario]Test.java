package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendToAscii_[Scenario]

Test {

    @Test
    public void appendToAscii_[ Scenario]Test() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder("ä ö");
        UrlBuilder.appendToAscii(sb, true, null);
        assertEquals("%E4%E6", sb.toString());
    }

}