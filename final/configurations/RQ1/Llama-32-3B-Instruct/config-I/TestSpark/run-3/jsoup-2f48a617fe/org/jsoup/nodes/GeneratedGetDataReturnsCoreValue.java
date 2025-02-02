package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedGetDataReturnsCoreValue {

    @Test
    public void getDataReturnsCoreValue() {
        // Given
        String data = "test";
        Comment comment = new Comment(data);

        // When
        String result = comment.getData();

        // Then
        assertEquals(comment.value, result);
    }

}