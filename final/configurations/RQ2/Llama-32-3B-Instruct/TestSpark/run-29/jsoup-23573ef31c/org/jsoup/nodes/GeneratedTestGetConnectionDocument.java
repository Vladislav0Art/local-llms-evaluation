package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedTestGetConnectionDocument {

    private String baseUri = "";

    private String location() {
        return "https://example.com";
    }
}

public class Parser {
    public void parseDocument(Document document) {
    }
}

public class QuirksMode {
    public boolean isQuirksMode() {
        return true;
    }
}

public class Connection {
    public Document getDocument() {
        return new Document();
    }
}

public class FormElement {
    private String elementId = "input";
    private String elementName = "username";

    public void setElementName(String name) {
        this.elementName = name;
    }

    public String getElementId() {
        return elementId;
    }

    public String getElementName() {
        return elementName;
    }
}

public class GeneratedTest {

    @Test
    public void testGetConnectionDocument() throws Exception {
        Connection connection = new Connection();
        when(connection.getDocument()).thenReturn(new Document());
        Document document = connection.getDocument();
        assertTrue(document.baseUri.equals(""));
    }

}