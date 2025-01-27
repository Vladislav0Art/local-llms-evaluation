package org.jsoup.helper;

public class GeneratedAppendKeyValue_NullKeyValTest {

    @Test
    public void appendKeyValue_NullKeyValTest() {
        // given
        Connection.KeyVal kv = null;
        UrlBuilder builder = new UrlBuilder(null);

        // when and then
        assertThrows(UnsupportedEncodingException.class, () -> builder.appendKeyVal(kv));
    }

}