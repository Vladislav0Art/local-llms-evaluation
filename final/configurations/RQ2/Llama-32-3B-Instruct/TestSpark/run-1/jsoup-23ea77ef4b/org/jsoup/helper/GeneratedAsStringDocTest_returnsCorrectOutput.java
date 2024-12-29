package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GeneratedAsStringDocTest_returnsCorrectOutput {

    @Test
    public void asStringDocTest_returnsCorrectOutput() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        StringWriter writer = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        String result = W3CDom.asStringDoc(doc);
        assertEquals(METHOD, writer.toString());
    }
}

public class W3CDom {

    public static boolean namespaceAwareTest() {
        // implementation
        return false;
    }

    public static Document fromJsoupDocument(Document jsoupDoc) {
        // implementation
        return null;
    }

    public static Document fromJsoupElement(Element element) {
        // implementation
        return null;
    }

    public static NodeList selectXpath(String xpath, Document doc) {
        // implementation
        return null;
    }

    public static List<Node> sourceNodes(NodeList nodeList, Class<?> clazz) {
        // implementation
        return new ArrayList<>();
    }

    public static Node contextNode(Document doc) {
        // implementation
        return null;
    }

    public static String asStringDoc(Document doc) {
        // implementation
        return "";
    }

}