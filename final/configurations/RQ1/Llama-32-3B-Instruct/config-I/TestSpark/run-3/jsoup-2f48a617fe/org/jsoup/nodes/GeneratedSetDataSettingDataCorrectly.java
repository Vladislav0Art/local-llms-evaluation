package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedSetDataSettingDataCorrectly {

    @Test
    public void setDataSettingDataCorrectly() {
        // Given
        String newData = "new";
        Comment comment = new Comment("data");

        // When
        comment.setData(newData);

        // Then
        assertNotNull(comment);
        assertEquals(newData, comment.value);
    }

}