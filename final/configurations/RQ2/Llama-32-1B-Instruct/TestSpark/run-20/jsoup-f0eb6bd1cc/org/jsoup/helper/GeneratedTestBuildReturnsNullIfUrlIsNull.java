package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestBuildReturnsNullIfUrlIsNull {

    @Test
    public void testBuildReturnsNullIfUrlIsNull() {
        String url = null;
        URLBuilder builder = new UrlBuilder(url);
        assertNull(builder.build());
    }

}