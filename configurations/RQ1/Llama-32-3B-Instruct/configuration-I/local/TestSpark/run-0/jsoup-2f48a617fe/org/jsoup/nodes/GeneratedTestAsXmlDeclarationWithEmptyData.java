package org.jsoup.nodes;

import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestAsXmlDeclarationWithEmptyData {

    @Test
    public void testAsXmlDeclarationWithEmptyData() throws ParserConfigurationException, SAXException {
        Comment comment = new Comment("");
        XmlDeclaration result = comment.asXmlDeclaration();
        assertTrue(result.isEmpty());
    }
}

class Comment {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void asXmlDeclaration(PrintWriter printWriter) throws TransformerException, SAXException {
        if (!isEmpty()) {
            printWriter.println("<!--" + data + "-->");
        } else {
            printWriter.println("<!---->");
        }
    }
}

class XmlDeclaration {

    private boolean isEmpty;

    public XmlDeclaration(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

}