package org.jsoup.helper;

public class GeneratedTestNoKeyVal {

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
    public void testNoKeyVal() throws UnsupportedEncodingException {
        // Test()
    }

    @Before
    public void setup__() {
        // Test()
    }

    public static class WithMultipleKeyVals extends WithValidEncoding {
        private final String multipleKeyVals;

        public WithMultipleKeyVals(String multipleKeyVals) {
            super(multipleKeyVals);
            this.multipleKeyVals = multipleKeyVals;
        }
    }

}