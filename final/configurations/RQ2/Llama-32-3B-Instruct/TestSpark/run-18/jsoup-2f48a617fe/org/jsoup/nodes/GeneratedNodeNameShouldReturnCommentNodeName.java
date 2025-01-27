package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedNodeNameShouldReturnCommentNodeName {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Parser parser;

    public static final String DATA = "data";

    public static final String XML_DECLARATION = "<?xml version=\"1.0\"?>";

    @Test
    public void nodeNameShouldReturnCommentNodeName() {
        Comment comment = new Comment(DATA);
        assertEquals("comment", comment.nodeName());
    }

}