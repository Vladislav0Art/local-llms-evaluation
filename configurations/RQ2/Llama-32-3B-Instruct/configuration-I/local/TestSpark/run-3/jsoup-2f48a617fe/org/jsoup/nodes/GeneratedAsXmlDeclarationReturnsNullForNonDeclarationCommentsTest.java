package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

public class GeneratedAsXmlDeclarationReturnsNullForNonDeclarationCommentsTest {

    @Test
    public void asXmlDeclarationReturnsNullForNonDeclarationCommentsTest() {
        Comment comment = new Comment("data");
        assertNull(comment.asXmlDeclaration());
    }

}