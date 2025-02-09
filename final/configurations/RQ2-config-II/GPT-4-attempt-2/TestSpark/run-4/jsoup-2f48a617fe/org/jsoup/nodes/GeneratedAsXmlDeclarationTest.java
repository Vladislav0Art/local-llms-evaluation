package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclarationTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("Test comment");

        assertNull(comment.asXmlDeclaration());

        Comment declarationComment = new Comment("!DOCTYPE html");
        assertNotNull(declarationComment.asXmlDeclaration());
        assertTrue(declarationComment.asXmlDeclaration() instanceof XmlDeclaration);
    }

}