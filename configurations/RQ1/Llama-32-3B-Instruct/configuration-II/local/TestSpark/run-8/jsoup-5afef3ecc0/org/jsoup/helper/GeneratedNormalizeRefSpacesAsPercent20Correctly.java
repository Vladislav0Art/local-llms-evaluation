package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.util.HashMap;

public class GeneratedNormalizeRefSpacesAsPercent20Correctly {

    @Test
    public void normalizeRefSpacesAsPercent20Correctly() {
        String ref = "ref with %20 spaces";
        String normalized = UrlBuilder.normalizeRef(ref);
        assertEquals("ref%20spaces", normalized);
    }
}

}