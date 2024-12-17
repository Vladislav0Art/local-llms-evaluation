package org.jsoup.helper;

public class GeneratedAppendKeyValTest {

    public static class MockUrlBuilder extends UrlBuilder {
        @Override
        public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
            // just return the StringBuilder, mock it later in a method call
        }
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        MockUrlBuilder builder = new MockUrlBuilder();
        builder.appendKeyVal(kv1);
        assertEquals("key1=value1", builder.q.toString());
    }

}