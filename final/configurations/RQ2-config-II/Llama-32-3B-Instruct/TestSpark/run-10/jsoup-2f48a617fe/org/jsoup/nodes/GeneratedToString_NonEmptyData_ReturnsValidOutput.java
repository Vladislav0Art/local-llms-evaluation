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

public class GeneratedToString_NonEmptyData_ReturnsValidOutput {

    @Test
    public void toString_NonEmptyData_ReturnsValidOutput() {
        Comment comment = new Comment("non-empty-data");
        String expectedOutput = "<!--non-empty-data-->";
        assertEquals(expectedOutput, comment.toString());
    }

}