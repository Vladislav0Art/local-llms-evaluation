package org.jsoup.helper;

public class GeneratedUrlBuilder_appendKeyVal_WithKeyValue {

    @Test
    public void urlBuilder_appendKeyVal_WithKeyValue() throws UnsupportedEncodingException {
        //given
        String key = "key";
        String value = "value";
        Connection.KeyVal kv = new Connection.KeyVal(key, value);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));

        //when
        URL url = builder.appendKeyVal(kv);

        //then
        assertEquals(builder.build().toString(), url.toString());
    }

}