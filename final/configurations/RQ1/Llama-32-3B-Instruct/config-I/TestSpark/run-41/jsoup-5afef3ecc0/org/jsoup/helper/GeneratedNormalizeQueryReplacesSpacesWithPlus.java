package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import javax.annotation.Nullable;

public class GeneratedNormalizeQueryReplacesSpacesWithPlus {

    @Test
    public void normalizeQueryReplacesSpacesWithPlus() {
        String q = "query+value";
        String normalizedQ = UrlBuilder.normalizeQuery(q);
        assertTrue(normalizedQ.contains("+"));
    }

}