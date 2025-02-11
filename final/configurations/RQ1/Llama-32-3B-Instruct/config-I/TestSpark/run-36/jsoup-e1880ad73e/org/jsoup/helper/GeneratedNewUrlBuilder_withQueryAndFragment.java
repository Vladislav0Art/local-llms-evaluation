package org.jsoup.helper;

public class GeneratedNewUrlBuilder_withQueryAndFragment {

    @Test
    public void newUrlBuilder_withQueryAndFragment() {
        Connection inputUrl = new Connection();
        inputUrl.setProtocol("http:");
        inputUrl.setPort(8080);
        inputUrl.setHost("example.co.uk");
        inputUrl.setPath("/path/to/resource#fragment");
        urlBuilder(inputUrl, "http://localhost:8080/path/to/resource", true);
    }

}