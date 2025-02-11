package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalizeRefReplacesSpacesWithPercent20s {

    @Test
    public void normalizeRefReplacesSpacesWithPercent20s() {
        String input = "# ref = value with spaces";
        String expectedOutput = "#ref=%20value%20with%20spaces";
        assertEquals(expectedOutput, UrlBuilder.normalizeRef(input));
    }

}