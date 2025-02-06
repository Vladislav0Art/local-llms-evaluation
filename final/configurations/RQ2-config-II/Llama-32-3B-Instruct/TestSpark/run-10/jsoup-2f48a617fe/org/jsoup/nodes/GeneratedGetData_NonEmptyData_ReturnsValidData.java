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

public class GeneratedGetData_NonEmptyData_ReturnsValidData {

    @Test
    public void getData_NonEmptyData_ReturnsValidData() {
        Comment comment = new Comment("non-empty-data");
        String expectedData = "non-empty-data";
        assertEquals(expectedData, comment.getData());
    }

}