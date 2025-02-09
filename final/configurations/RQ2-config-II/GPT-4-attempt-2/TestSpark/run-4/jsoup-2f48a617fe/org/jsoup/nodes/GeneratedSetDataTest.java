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
public class GeneratedSetDataTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test comment");
        assertEquals("Test comment", comment.getData());

        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}