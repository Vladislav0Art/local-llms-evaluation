package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSetData_SettingDataCorrectly {

    @Test
    public void setData_SettingDataCorrectly() {
        // Given
        Comment comment = new Comment("data");
        String newData = "new";

        // When
        comment.setData(newData);

        // Then
        assertNotNull(comment);
        assertEquals(newData, comment.value);
    }

}