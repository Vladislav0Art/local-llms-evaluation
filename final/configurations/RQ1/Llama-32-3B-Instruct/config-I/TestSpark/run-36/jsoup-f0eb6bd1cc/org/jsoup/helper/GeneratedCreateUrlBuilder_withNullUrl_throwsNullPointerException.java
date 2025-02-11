package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

public class GeneratedCreateUrlBuilder_withNullUrl_throwsNullPointerException {

    @Test
    public void createUrlBuilder_withNullUrl_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

}