package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedBuild_urlBuilder_empty_input {

    @Test
    public void build_urlBuilder_empty_input() {
        MockConnection mockConn = new MockConnection();
        mockConn.setKeepAlive(false);

        UrlBuilder builder = new UrlBuilder(mockConn);
        assertEquals("", builder.build().getURI());
    }

}