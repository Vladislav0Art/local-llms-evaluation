package org.jsoup.helper;

public class GeneratedAppendKeyVal_withFragment {

    @Test
    public void appendKeyVal_withFragment() {
        Connection inputUrl = new Connection();
        inputUrl.setProtocol("http:");
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        inputUrl.setPath("/path/to/resource#existing=fragment");
        urlBuilder(inputUrl, "http://localhost:8080/path/to/resource", true);
        assertEquals("existing=fragment", inputUrl.getQuery());
    }

}