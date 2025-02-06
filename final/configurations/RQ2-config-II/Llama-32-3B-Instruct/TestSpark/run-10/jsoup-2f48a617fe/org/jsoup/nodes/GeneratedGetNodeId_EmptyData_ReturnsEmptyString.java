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

public class GeneratedGetNodeId_EmptyData_ReturnsEmptyString {

    @Test
    public void getNodeId_EmptyData_ReturnsEmptyString() {
        Comment comment = new Comment("");
        assertEquals("", comment.nodeId());
    }

}