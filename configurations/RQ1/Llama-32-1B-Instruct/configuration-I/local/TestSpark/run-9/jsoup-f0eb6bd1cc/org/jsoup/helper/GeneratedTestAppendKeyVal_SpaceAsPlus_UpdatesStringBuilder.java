package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_SpaceAsPlus_UpdatesStringBuilder {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("https://example.com/path?a=1&b=2#anchor"));
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