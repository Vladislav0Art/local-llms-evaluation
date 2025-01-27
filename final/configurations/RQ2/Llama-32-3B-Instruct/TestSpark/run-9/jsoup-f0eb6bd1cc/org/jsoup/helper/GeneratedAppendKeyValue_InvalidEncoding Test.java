package org.jsoup.helper;

public class GeneratedAppendKeyValue_InvalidEncoding Test {

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