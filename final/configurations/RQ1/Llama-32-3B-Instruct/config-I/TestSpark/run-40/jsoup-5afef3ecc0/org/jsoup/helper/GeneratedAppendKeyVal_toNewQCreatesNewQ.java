package org.jsoup.helper;

public class GeneratedAppendKeyVal_toNewQCreatesNewQ {

    @Test
    public void appendKeyVal_toNewQCreatesNewQ() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL());
        String q = "{}";
        builder.q = StringUtil.borrowBuilder().append(q);
        builder.appendKeyVal(kv);
        assertTrue(builder.q != null && builder.q.toString().equals("{}&key=value"));
    }

}