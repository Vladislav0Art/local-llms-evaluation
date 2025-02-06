package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToString_returnsData {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Parser parser;

    @Test
    public void toString_returnsData() {
        String expectedData = "expectedData";
        Comment comment = new Comment(expectedData);
        assertEquals(expectedData, comment.toString());
    }

}