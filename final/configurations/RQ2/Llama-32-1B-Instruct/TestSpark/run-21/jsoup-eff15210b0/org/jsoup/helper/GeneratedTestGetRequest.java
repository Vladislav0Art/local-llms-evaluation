package org.jsoup.helper;

import org.junit.Test;

public class GeneratedTestGetRequest {

    @Test
    public void testGetRequest() {
        Request request = new Request();
        request.add(new Method("GET", "http://example.com"));
        System.out.println(request.getEndpoint());
    }

}