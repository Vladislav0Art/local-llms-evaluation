package org.jsoup.helper;

public class GeneratedAppendKeyVal_validKeyValue {

    @Test
    public void appendKeyVal_validKeyValue() throws UnsupportedEncodingException, URISyntaxException {
        // key value
        String url = "https://example.com";
        Connection connection = Mockito.mock(Connection.class);
        when(connection.toString()).thenReturn(url);
        UrlBuilder urlBuilder = new UrlBuilder((String) connection);
        KeyVal kv = new KeyVal();
        kv.put("key", "value");
        urlBuilder.appendKeyVal(kv);
    }

}