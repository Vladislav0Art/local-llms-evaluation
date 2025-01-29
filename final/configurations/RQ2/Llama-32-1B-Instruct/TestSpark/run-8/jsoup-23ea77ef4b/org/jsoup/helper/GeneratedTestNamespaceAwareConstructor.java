package org.jsoup.helper;

public class GeneratedTestNamespaceAwareConstructor {

    @Test
    public void testNamespaceAwareConstructor() {
        W3CDom dom = new org.jsoup.nodes.Document();
        W3CElementHelper element = new W3CElementHelper(dom);
        assertTrue(element.getName().equals("namespaceAware"));
    }

}