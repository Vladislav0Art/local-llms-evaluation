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
public class GeneratedToStringTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("<!--Test comment-->", comment.toString());
    }

}