package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.HashMap;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() {
        String ref = " foo ";
        String result = UrlBuilder.normalizeRef(ref);
        assertEquals("%20%20", result);
    }

}