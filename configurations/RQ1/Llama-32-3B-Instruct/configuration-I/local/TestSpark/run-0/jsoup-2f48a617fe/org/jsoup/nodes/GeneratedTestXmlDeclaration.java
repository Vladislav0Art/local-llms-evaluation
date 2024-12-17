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

public class GeneratedTestXmlDeclaration {

    @Test
    public void testXmlDeclaration() throws ParserConfigurationException, SAXException {
        Comment comment = new Comment("This is a comment");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(outContent);
        comment.asXmlDeclaration(printWriter);
        String output = outContent.toString();
        assertTrue(output.contains("<!--This is a comment-->"));
    }

}