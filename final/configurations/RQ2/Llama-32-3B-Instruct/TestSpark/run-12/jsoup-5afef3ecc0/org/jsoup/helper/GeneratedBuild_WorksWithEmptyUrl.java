package org.jsoup.helper;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuild_WorksWithEmptyUrl {

    @Test
    public void build_WorksWithEmptyUrl() {
        UrlBuilder builder = new UrlBuilder(null);
        assertEquals(null, builder.build());
    }

}