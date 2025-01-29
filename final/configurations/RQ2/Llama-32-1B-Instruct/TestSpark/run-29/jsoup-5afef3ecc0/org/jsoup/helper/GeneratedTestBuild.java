package org.jsoup.helper;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestBuild {

    @Mock
    private Connection.KeyVal mockKv;

    @Mock
    private URLDecoder mockDecoder;

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path/to/resource?param1=value1&param2=value2";
        URL result = build(inputUrl);
        assertNotEquals(null, result);
    }

}