package org.jsoup.helper;

public class GeneratedTestWithInvalidEncoding {

    @Before
    public void setup() throws UnsupportedEncodingException {
        // NoOperation
    }

    public static class WithInputUrl extends WithKeyVal {
        private final String inputUrl;

        public WithInputUrl(String inputUrl) {
            super(inputUrl);
            this.inputUrl = inputUrl;
        }
    }

    public static class NoKeyVal extends WithInvalidEncoding {
        private final String noKeyVal;

        public NoKeyVal(String noKeyVal) {
            super(noKeyVal);
            this.noKeyVal = noKeyVal;
        }
    }

    @Test
    public void testWithInvalidEncoding() throws UnsupportedEncodingException {
        // Test()
    }

    @Before
    public void setup_() throws UnsupportedEncodingException {
        // Test()
    }

    public static class WithValidEncoding extends WithMultipleKeyVals {
        private final String validEncoding;

        public WithValidEncoding(String validEncoding) {
            super(validEncoding);
            this.validEncoding = validEncoding;
        }
    }

}