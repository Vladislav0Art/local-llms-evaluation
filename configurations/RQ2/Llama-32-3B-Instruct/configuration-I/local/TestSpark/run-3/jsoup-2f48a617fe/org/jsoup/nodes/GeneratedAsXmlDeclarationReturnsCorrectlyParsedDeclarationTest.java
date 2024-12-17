package org.jsoup.nodes;

import org.jsoup.Document;
import org.jsoup.nodes.Document.Builder;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedAsXmlDeclarationReturnsCorrectlyParsedDeclarationTest {

    @Test
    public void asXmlDeclarationReturnsCorrectlyParsedDeclarationTest() {
        String xmlDeclaration = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root>Hello World!</root>";
        Comment comment = new Comment(xmlDeclaration);
        assertTrue(comment.asXmlDeclaration().tagName().toString().equals("root"));
    }

}