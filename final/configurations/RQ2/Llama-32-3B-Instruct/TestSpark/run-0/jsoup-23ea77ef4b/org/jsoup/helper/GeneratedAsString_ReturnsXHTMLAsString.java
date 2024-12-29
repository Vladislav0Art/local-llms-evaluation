package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeEach;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runner.MockitoJUnitRunner;

public class GeneratedAsString_ReturnsXHTMLAsString {

    @Mock
    private Document mockDocument;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void asString_ReturnsXHTMLAsString() throws XPathExpressionException {
        String expected = "<!-- test -->";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = builder.parse(new DOMSource("<!-- test -->"));
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.transform(new DOMSource(document), new StreamResult(outContent));
        String actual = W3CDom.asString(mockDocument, null);
        assertEquals(expected, actual);
    }
}

public class W3CDom {
    public static boolean namespaceAware() {
        // implementation
    }

    public static NodeList selectXpath(String xpath, Document document) throws XPathExpressionException {
        // implementation
    }

    public static NodeList selectXpath(String xpath, Node context) throws XPathExpressionException {
        // implementation
    }

    public static List<Node> sourceNodes(NodeList nodes, Class<?> clazz) {
        // implementation
    }

    public static Node contextNode(Document document) {
        // implementation
    }

    public static String asString(Document document, String method) {
        // implementation
    }

}