package org.jsoup.helper;

public class GeneratedAppendKeyValue_InvalidChar Test {

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

}