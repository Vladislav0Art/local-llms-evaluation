package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSetData_NonEmptyData_SetToValidData {

    @Test
    public void setData_NonEmptyData_SetToValidData() {
        Comment comment = new Comment("non-empty-data");
        String expectedData = "new-data";
        comment.setData(expectedData);
        assertEquals(expectedData, comment.getData());
    }

}