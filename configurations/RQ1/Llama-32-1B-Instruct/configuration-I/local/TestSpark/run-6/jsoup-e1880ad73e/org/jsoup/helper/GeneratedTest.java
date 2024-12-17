package org.jsoup.helper;

public class GeneratedTest {

}

/**
 * Test for UrlBuilder[appendKeyVal][Test].
 */
public class UrlBuilderAppendKeyValTest {

    @Test
    public void testAppendKeyVal_EmptyMap() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(null);
        assertEquals(null, urlBuilder.getU());
    }

    @Test
    public void testAppendKeyVal_NonNullableMap() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?param=value");
        urlBuilder.appendKeyVal(new org.jsoup.model.KeyVal() {
            @Override
            public String getKey() {
                return "key";
            }

            @Override
            public Object getValue() {
                return "value";
            }
        });
        assertEquals("https%3A%2F%2Fexample.com%2Fpath%3Fparam%3Dvalue", urlBuilder.getU());
    }
}

@Test
public void testAppendKeyVal_MalformedQuery() throws UnsupportedEncodingException {
    UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?param=value#anchor");
    urlBuilder.appendKeyVal(new org.jsoup.model.KeyVal() {
        @Override
        public String getKey() {
            return "key";
        }

        @Override
        public Object getValue() {
            return "value";
        }
    });
    assertEquals(null, urlBuilder.getU());
}
	}

@Test
public void testAppendKeyVal

UnsupportedEncoding() throws UnsupportedEncodingException {
    UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?param=value");
    try {
        urlBuilder.appendKeyVal(new org.jsoup.model.KeyVal() {
            @Override
            public String getKey() {
                return "key";
            }

            @Override
            public Object getValue() {
                return "value";
            }
        });
    } catch (UnsupportedEncodingException e) {
        // expected
    }
}
	}

@Test
public void testAppendKeyVal_NonNullableStringBuilder() throws UnsupportedEncodingException {
    UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path?param=value");
    StringBuilder sb = new StringBuilder();
    urlBuilder.appendKeyVal(new org.jsoup.model.KeyVal() {
        @Override
        public String getKey() {
            return "key";
        }

        @Override
        public Object getValue() {
            return "value";
        }
    });
    assertEquals("https%3A%2F%2Fexample.com%2Fpath%3Fparam%3Dvalue", sb.toString());
}
	}

            }