package org.jsoup.helper;

public class GeneratedAppendKeyValWithValidKeyAndValueReturnsCorrectQueryString {

    @Test
    public void appendKeyValWithValidKeyAndValueReturnsCorrectQueryString() {
        // given
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");

        // when
        StringBuilder q = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);

        // then
        assertEquals("?key=value", q.toString());
    }

}