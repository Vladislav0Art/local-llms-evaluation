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

public class GeneratedGetNodeId_NonEmptyData_ReturnsValidId {

    @Test
    public void getNodeId_NonEmptyData_ReturnsValidId() throws IOException {
        Comment comment = new Comment("non-empty-data");
        String expectedId = comment.nodeId();
        assertNotNull(expectedId);
        assertTrue(expectedId.startsWith("comment"));
    }

}