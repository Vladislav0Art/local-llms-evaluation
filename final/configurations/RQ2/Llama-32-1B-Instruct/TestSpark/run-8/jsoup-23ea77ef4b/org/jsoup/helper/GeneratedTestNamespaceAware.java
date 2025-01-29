package org.jsoup.helper;

public class GeneratedTestNamespaceAware {

    @Test
    public void testNamespaceAware() {
        W3CElementHelper element = new W3CElementHelper(new org.jsoup.nodes.Document());
        assertTrue(element.getName().equals("namespaceAware"));
    }

}