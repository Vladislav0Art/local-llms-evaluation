package org.jsoup.helper;

public class GeneratedTest {

    public static String asString(Element element) {
        return element.toString();
    }

    public static Element contextNode(Document document) {
        return document.getDocumentElement();
    }
}

public class NodeSourceNodesTest {

    @Test
    public void testSourceNodes() {
        NodeList nodeList = new DOMBuilder().build("<root><child>Child content</child></root>");
        List<org.jsoup.nodes.Node> result = DOMHelper.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertEquals("Child", (String) result.get(1));
    }
}

@Test
public void testElementCreation() {
    Element el = new DOMBuilder().build("<root><child>Child content</child></root>");
    assertEquals("root", el.asElement().getAttribute("tagName"));
}

@Test
public void testContextNode() {
    Document document = new DOMBuilder().parseString("<root><child>Child content</child></root>");
    Element context = DOMHelper.contextNode(document);
    assertEquals("root", context.asElement().getAttribute("tagName"));
}
	}

@Test
public void testDocumentCreation() {
    Document document = new DOMBuilder().build("<root><child>Child content</child></root>");
    assertNotNull(document.getDocumentElement());
}

@Test
public void testStringConversion() {
    Document document = new DOMBuilder().parseString("<root><child>Child content</child></root>");
    assertEquals("root", DOMHelper.asString(DOMHelper.contextNode(document)));
}

}