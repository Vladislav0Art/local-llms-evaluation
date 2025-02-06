package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetDataSetsNewDataProperly {

    @Test
    public void SetDataSetsNewDataProperly() {
        String expectedData = "New Data";
        Comment comment = new Comment("Old Data");
        comment.setData(expectedData);
        assertEquals(expectedData, comment.getData());
    }

}