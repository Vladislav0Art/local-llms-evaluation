package org.jsoup.helper;

public class GeneratedAppendKeyVal_withSpaceInValue {

    @Test
    public void appendKeyVal_withSpaceInValue() {
        Connection inputUrl = new Connection();
        inputUrl.setProtocol("http:");
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        urlBuilder(inputUrl, "http://localhost:8080/path/to/resource", true);
        assertEquals("existing=query+value", inputUrl.getQuery());
    }

}