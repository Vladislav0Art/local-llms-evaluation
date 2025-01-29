package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Generated[UrlBuilder][Scenario]

Test_buildWithoutAppendKeyVal {

    @Test
    public void [UrlBuilder][Scenario]Test_buildWithoutAppendKeyVal() {
        URL url = new URL("https://example.com/path");
        StringBuilder expected = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(url);
        builder.build(expected.toString());
        assertEquals(expected.toString(), expected.toString());
    }

}