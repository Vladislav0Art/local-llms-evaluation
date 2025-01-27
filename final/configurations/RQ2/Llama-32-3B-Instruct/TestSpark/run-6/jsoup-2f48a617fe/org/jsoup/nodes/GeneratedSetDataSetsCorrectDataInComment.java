package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSetDataSetsCorrectDataInComment {

    @Test
    public void setDataSetsCorrectDataInComment() {
        // Given
        Comment comment = new Comment("oldData");
        String expectedData = "expectedData";

        // When
        comment.setData(expectedData);

        // Then
        assertEquals(expectedData, comment.getData());
    }

}