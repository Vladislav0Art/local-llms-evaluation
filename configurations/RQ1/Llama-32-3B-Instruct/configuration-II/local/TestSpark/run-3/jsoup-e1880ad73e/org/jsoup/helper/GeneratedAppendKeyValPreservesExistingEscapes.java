package org.jsoup.helper;

public class GeneratedAppendKeyValPreservesExistingEscapes {

    @Test
    public void appendKeyValPreservesExistingEscapes() {
        // given
        Connection.KeyVal kv = new Connection.KeyVal("key", "Hello, World!");

        // when
        UrlBuilder urlBuilder = new UrlBuilder(null);
        StringBuilder q = StringUtil.borrowBuilder();
        q.append("?"); // existing escape
        urlBuilder.appendKeyVal(kv);

        // then
        assert q.toString().equals(IDN.toASCII("key=Hello%2C+World%!?"));
    }

}