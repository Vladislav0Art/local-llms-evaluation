package org.jsoup.helper;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.io.UnsupportedEncodingException;

public class GeneratedDecodePartEncodesSpacesCorrectlyTest {

    @Test
    public void decodePartEncodesSpacesCorrectlyTest() {
        String decoded = org.jsoup.helper.UrlBuilder.decodePart("%20");
        assertEquals(" ", decoded);
    }

}