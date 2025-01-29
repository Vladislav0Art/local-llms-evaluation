package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestConnectMockedUrl {

    private MockUrl mockUrl;

    @Before
    public void setup() {
        mockUrl = new MockUrl();
    }

    @Test
    public void testConnectMockedUrl() {
        mockUrl.resource().toString();
        verifyAllMocks();
    }

    private class MockUrl {
        public String resource() {
            return "mock_url";
        }
    }

    private class VerifyAllMocks extends RuntimeException {
        public VerifyAllMocks() {
        }
    }

}