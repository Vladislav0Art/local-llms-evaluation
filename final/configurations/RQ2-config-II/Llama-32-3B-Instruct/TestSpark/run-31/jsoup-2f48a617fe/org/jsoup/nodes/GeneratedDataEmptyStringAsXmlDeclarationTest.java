package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataEmptyStringAsXmlDeclarationTest {

    private final Document doc = new Document();

    @Test
    public void dataEmptyStringAsXmlDeclarationTest() throws IOException {
        String data = "";
        Comment comment = new Comment(data);
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertTrue(xmlDeclaration == null || xmlDeclaration.getData().isEmpty());
    }

}