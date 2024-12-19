package org.jsoup.helper;

public class GeneratedAppendKeyValEncodesValue {

    @Test
    public void appendKeyValEncodesValue() {
        // given
        Connection.KeyVal kv = new Connection.KeyVal("key", "Hello, World!");

        // when
        UrlBuilder urlBuilder = new UrlBuilder(null);
        StringBuilder q = StringUtil.borrowBuilder();
        urlBuilder.appendKeyVal(kv);

        // then
        assert q.toString().equals(IDN.toASCII("key=Hello%2C+World%!"));
    }

}