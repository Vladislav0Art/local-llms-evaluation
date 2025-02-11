package org.jsoup.helper;

public class GeneratedAppendKeyVal_existingQuery {

    @Test
    public void appendKeyVal_existingQuery() {
        Connection inputUrl = new Connection();
        inputUrl.setProtocol("http:");
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        inputUrl.setPath("/path/to/resource?existing=query");
        urlBuilder(inputUrl, "http://localhost:8080/path/to/resource", true);
        assertEquals("existing=query", inputUrl.getQuery());
    }

}