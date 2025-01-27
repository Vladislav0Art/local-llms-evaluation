package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetParamsStringNullQuery {

    @Test
    public void getParamsStringNullQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.getParamsString(null);
    }

}