package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetResponse {

    @Test
    public void testSetResponse() {
        Response response = new Response();
        response.setStatusCode(201);
        assertEquals(201, response.getStatusCode());
        assertEquals("Created", response.getResponse());
    }
}

class CookieManager {
    private boolean hasCookie;

    public boolean hasCookie() {
        return hasCookie;
    }

    public void setHasCookie(boolean hasCookie) {
        this.hasCookie = hasCookie;
    }
}

class ProxyFactory {
    private boolean hasProxy;

    public boolean hasProxy() {
        return hasProxy;
    }

    public void setHasProxy(boolean hasProxy) {
        this.hasProxy = hasProxy;
    }

}