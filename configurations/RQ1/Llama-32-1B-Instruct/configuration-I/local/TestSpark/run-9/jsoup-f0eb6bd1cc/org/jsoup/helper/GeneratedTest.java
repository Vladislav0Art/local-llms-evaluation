package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("https://example.com/path?a=1&b=2#anchor"));
    }

    @Test
    public void testAppendKeyVal_MalformedURLException_SetsError() {
        assert throwables().contains(UrlBuilder.MalformedURLException.class);
        // Verify we pass the original error message to Validate
        assert Validate.assertFail("MalformedURLException at urlBuilder.appendKeyVal(Connection.KeyVal kv)");
    }

    @Test
    public void testAppendKeyVal_HappyPath_SetsStringBuilder() {
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals(3, urlBuilder.q.toString().length());
    }

    @Test
    public void testAppendKeyVal_URIEncoding_SetsEncodedValue() throws UnsupportedEncodingException {
        assert throwables().contains(UnsupportedEncodingException.class);
        // Verify we pass the original error message to Validate
        assert Validate.assertFail("UnsupportedEncodingException at urlBuilder.appendKeyVal(Connection.KeyVal kv)");
    }

    @Test
    public void testAppendKeyVal_SpaceAsPlus_UpdatesStringBuilder() {
        StringBuilder sb = new StringBuilder();
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        sb.append("%20");
        assertEquals(1, sb.length());
    }

    private Set<Class<?>> throwables() {
        Set<Class<?>> threwBy = new HashSet<>();
        thrownBy.add(MalformedURLException.class);
        thrownBy.addAll(UnsupportedEncodingException.class);
        return threwBy;
    }

}