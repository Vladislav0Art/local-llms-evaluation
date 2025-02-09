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
public class GeneratedCloneTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Test comment");
        Comment comment2 = comment.clone();

        assertNotEquals(comment.hashCode(), comment2.hashCode());
        assertEquals(comment.toString(), comment2.toString());
    }

}