package org.jsoup.helper;

import org.junit.Test;

public class GeneratedTestPostRequest {

    @Test
    public void testPostRequest() {
        Request request = new Request();
        request.add(new Method("POST", "http://example.com"));
        System.out.println(request.getEndpoint());
    }

}