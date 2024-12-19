package org.jsoup.helper;

public class GeneratedTestNoOperation {

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
    public void testNoOperation() throws UnsupportedEncodingException {
        // Test()
    }

    public static class WithInvalidEncoding extends WithMultipleKeyVals {
        private final String invalidEncoding;

        public WithInvalidEncoding(String invalidEncoding) {
            super(invalidEncoding);
            this.invalidEncoding = invalidEncoding;
        }
    }

}