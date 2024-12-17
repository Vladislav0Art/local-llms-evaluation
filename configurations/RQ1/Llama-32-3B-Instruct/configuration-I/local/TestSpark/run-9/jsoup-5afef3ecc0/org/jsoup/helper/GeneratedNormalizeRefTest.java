package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() {
        String ref = " 123 ";
        assertEquals(" 123 ", UrlBuilder.normalizeRef(ref));
    }

}