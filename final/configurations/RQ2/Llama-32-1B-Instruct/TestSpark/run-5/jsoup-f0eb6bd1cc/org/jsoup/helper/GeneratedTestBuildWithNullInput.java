package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestBuildWithNullInput {

    @Test
    public void testBuildWithNullInput() {
        try {
            new UrlBuilder(null).build();
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected exception
        }
    }

}