package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import javax.annotation.Nullable;

public class GeneratedNormalizeRefReplacesSpacesWithPercent20 {

    @Test
    public void normalizeRefReplacesSpacesWithPercent20() {
        String r = "ref + with spaces";
        String normalizedR = UrlBuilder.normalizeRef(r);
        assertTrue(normalizedR.contains("%20"));
    }

}