package org.jsoup.helper;

public class GeneratedTestWithMultipleKeyVals {

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
    public void testWithMultipleKeyVals() throws UnsupportedEncodingException {
        // Test()
    }
}

public class WithKeyVal {
    private final String keyVal;

    public WithKeyVal(String keyVal) {
        super(keyVal);
        this.keyVal = keyVal;
    }
}

public class WithInvalidEncoding extends WithMultipleKeyVals {
    private final String invalidEncoding;

    public WithInvalidEncoding(String invalidEncoding) {
        super(invalidEncoding);
        this.invalidEncoding = invalidEncoding;
    }
}

public class WithMultipleKeyVals extends WithValidEncoding {
    private final String multipleKeyVals;

    public WithMultipleKeyVals(String multipleKeyVals) {
        super(multipleKeyVals);
        this.multipleKeyVals = multipleKeyVals;
    }

}