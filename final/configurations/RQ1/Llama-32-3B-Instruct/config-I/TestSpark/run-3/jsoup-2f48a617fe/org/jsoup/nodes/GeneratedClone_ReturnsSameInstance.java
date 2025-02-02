package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedClone_ReturnsSameInstance {

    @Test
    public void clone_ReturnsSameInstance() {
        // Given
        Comment comment = new Comment("data");

        // When
        Comment clonedComment = comment.clone();

        // Then
        assertEquals(comment, clonedComment);
    }

}