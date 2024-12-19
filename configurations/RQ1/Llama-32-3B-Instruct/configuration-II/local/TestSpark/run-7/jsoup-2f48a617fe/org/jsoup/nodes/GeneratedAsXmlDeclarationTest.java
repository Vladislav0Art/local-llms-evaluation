package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"");
        assertNull(comment.asXmlDeclaration());

        Comment comment2 = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"");
        XmlDeclaration decl = comment2.asXmlDeclaration();
        assertNotNull(decl);
    }

}