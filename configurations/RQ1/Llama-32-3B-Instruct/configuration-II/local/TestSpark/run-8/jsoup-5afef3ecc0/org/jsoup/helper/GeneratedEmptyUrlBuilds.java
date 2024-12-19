package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.util.HashMap;

public class GeneratedEmptyUrlBuilds {

    @Test
    public void emptyUrlBuilds() {
        URL inputUrl = null;
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
    }

}