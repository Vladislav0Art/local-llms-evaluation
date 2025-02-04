package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Generated[asXmlDeclaration][WithXmlData]

Test {

    @Test
    public void [asXmlDeclaration][WithXmlData]Test() throws IOException {
        String xmlData = "test";
        Comment comment = new Comment(xmlData);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}