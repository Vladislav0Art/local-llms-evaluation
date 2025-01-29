package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetCookieManager() {
        TestCookieManager cookieManager = new TestCookieManager();
        assertEquals(true, cookieManager.hasCookie());
    }

    @Test
    public void testGetProxyFactory() {
        TestProxyFactory proxyFactory = new TestProxyFactory();
        assertEquals(true, proxyFactory.hasProxy());
    }
}

@Test
public void testGetResponse() {
    Response response = new Response();
    assertEquals(200, response.getStatusCode());
    assertEquals("OK", response.getResponse());
}

@Test
public void testSetResponse() {
    Response response = new Response();
    response.setStatusCode(201);
    assertEquals(201, response.getStatusCode());
    assertEquals("Created", response.getResponse());
}
	}

@Test
public void testGetCookieManager() {
    CookieManager cookieManager = new CookieManager();
    assertEquals(true, cookieManager.hasCookie());
}

@Test
public void testGetProxyFactory() {
    ProxyFactory proxyFactory = new ProxyFactory();
    assertEquals(true, proxyFactory.hasProxy());
}
	}

@Test
public void testGetResponse() {
    Response response = new Response();
    assertEquals(200, response.getStatusCode());
    assertEquals("OK", response.getResponse());
}

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