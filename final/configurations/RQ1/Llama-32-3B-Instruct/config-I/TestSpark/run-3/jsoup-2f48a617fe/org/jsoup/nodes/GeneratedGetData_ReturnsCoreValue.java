package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetData_ReturnsCoreValue {

    @Test
    public void getData_ReturnsCoreValue() {
        // Given
        Comment comment = new Comment("test");

        // When
        String result = comment.getData();

        // Then
        assertEquals(comment.value, result);
    }

}