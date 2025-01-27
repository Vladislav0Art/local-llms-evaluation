package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildEmptyUrlTest {

    @Test
    public void buildEmptyUrlTest() {
        UrlBuilder builder = new UrlBuilder(null);
        assertNull(builder.build());
    }

}