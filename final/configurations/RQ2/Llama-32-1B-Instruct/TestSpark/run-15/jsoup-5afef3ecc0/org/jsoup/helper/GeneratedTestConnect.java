package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestConnect {

    private MockUrl mockUrl;

    @Before
    public void setup() {
        mockUrl = new MockUrl();
    }

    @Test
    public void testConnect() {
        Jsoup.connect(mockUrl).get();
        verifyAllMocks();
    }

}