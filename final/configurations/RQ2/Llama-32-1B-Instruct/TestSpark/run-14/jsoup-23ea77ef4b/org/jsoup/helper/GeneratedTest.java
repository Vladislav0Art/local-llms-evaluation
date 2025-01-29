package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void namespaceAware() {
        W3CDom w3cdom = new W3CDom();
        assertTrue(w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAwareNamespace() {
        W3CDom w3cdom = new W3CDom();
        assertEquals(true, w3cdom.namespaceAware(true));
        assertEquals(false, w3cdom.namespaceAware(false));
    }

}