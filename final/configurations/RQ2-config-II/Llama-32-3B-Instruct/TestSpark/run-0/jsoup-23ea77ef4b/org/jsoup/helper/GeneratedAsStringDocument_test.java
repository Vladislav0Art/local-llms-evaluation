package org.jsoup.helper;

public class GeneratedAsStringDocument_test {

    private static final Document DOC = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

    @Test
    public void asStringDocument_test() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().createDocument(null, null, null);
        Map<String, String> properties = new HashMap<>();
        StringWriter sw = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer(new DOMSource(doc), new StreamResult(sw));
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.transform(new DOMSource(doc), new StreamResult(sw));
        assertEquals("test", W3CDom.asString(doc, properties).trim());
    }

}