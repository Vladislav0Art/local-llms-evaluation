package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNewUrlBuilderInvalidProtocolTest {

    @Test
    public void newUrlBuilderInvalidProtocolTest() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(new URL("invalid:https://example.com/path?query=value#ref")));
    }

}