package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void builderUrl_BasicTest() {
        // given
        URL inputUrl = new URL("http://localhost/test");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // when
        URL url = builder.build();

        // then
        assertNotNull(url);
        assertEquals(inputUrl, url);
    }

    @Test
    public void builderUrl_MalformedUriTest() {
        // given
        URL inputUrl = null;
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // when and then
        assertThrows(URISyntaxException.class, () -> builder.build());
    }

    @Test
    public void appendKeyValue_StringKeyValTest() throws UnsupportedEncodingException {
        // given
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(null);

        // when
        builder.appendKeyVal(kv);

        // then
        assertTrue(builder.build().getQuery().contains(StringUtil.encode("key=value")));
    }

    @Test
    public void appendKeyValue_NullKeyValTest() {
        // given
        Connection.KeyVal kv = null;
        UrlBuilder builder = new UrlBuilder(null);

        // when and then
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(kv));
    }

    @Test
    public void appendKeyValue_InvalidChar

    Test() throws UnsupportedEncodingException {
        // given
        String key = "key";
        String value = null;
        UrlBuilder builder = new UrlBuilder(null);

        // when and then
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new Connection.KeyVal(key, value)));
    }

    @Test
    public void appendKeyValue_InvalidEncoding

    Test() throws UnsupportedEncodingException {
        // given
        String key = "key";
        String value = new String(null, UTF_8);
        UrlBuilder builder = new UrlBuilder(null);

        // when and then
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(new Connection.KeyVal(key, value)));
    }

}