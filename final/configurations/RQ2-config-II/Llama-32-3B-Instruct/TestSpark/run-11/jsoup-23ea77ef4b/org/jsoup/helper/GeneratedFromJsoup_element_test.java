package org.jsoup.helper;

public class GeneratedFromJsoup_element_test {

    @Test
    public void fromJsoup_element_test() throws Exception {
        org.jsoup.nodes.Element jsElement = createElement();
        Document result = W3CDom.fromJsoup(jsElement);
        assertNotNull(result);
        assertTrue(result.getNamespaceURI().equals(jsElement.getNamespaceURI()));
    }

}