package org.jsoup.helper;

public class GeneratedAppendKeyValue_StringKeyValTest {

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

}