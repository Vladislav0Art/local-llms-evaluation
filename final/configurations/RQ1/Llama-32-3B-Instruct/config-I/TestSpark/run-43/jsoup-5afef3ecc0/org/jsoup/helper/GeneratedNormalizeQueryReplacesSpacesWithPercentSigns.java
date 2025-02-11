package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalizeQueryReplacesSpacesWithPercentSigns {

    @Test
    public void normalizeQueryReplacesSpacesWithPercentSigns() {
        String input = "? query = value ";
        String expectedOutput = "%3F+query=%3Dvalue%20";
        assertEquals(expectedOutput, UrlBuilder.normalizeQuery(input));
    }

}