package org.jsoup.helper;

public class GeneratedTestContextNode {

    public static Builder newDocumentBuilder() {
        return new Builder();
    }
}

public class Builder {
    public void parse(byte[] input) throws Exception {
        // implementation
    }

    public Document build() throws Exception {
        // implementation
        return null;
    }
}

public class Document {
    // implementation
}

public class Node {
    // implementation
}

public class W3CDom {
    public static String asString(Document doc) {
        return doc.toString();
    }

    public static Node contextNode(Document doc) {
        return doc.getDocumentElement();
    }
}

public class GeneratedTest {

    @Test
    public void testContextNode() throws Exception {
        // Arrange
        String expected = "<html><body>Hello World!</body></html>";

        // Act
        DocumentBuilderFactory factory = new DocumentBuilderFactory();
        Document doc = factory.newDocumentBuilder().parse(new ByteArrayInputStream(expected.getBytes()));
        Node node = W3CDom.contextNode(doc);

        // Assert
        assertEquals(expected, W3CDom.asString(node));
    }

}