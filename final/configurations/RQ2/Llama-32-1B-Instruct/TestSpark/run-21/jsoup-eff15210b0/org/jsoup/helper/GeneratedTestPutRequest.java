package org.jsoup.helper;

import org.junit.Test;

public class GeneratedTestPutRequest {

    @Test
    public void testPutRequest() {
        Request request = new Request();
        request.add(new Method("PUT", "http://example.com"));
        System.out.println(request.getEndpoint());
    }

}