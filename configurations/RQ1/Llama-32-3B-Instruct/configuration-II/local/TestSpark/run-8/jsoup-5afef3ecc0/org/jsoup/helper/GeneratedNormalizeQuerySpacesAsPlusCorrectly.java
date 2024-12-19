package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.util.HashMap;

public class GeneratedNormalizeQuerySpacesAsPlusCorrectly {

    @Test
    public void normalizeQuerySpacesAsPlusCorrectly() {
        String query = "query with + spaces";
        String normalized = UrlBuilder.normalizeQuery(query);
        assertEquals("query%2Bspaces", normalized);
    }

}