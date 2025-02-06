package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedNodeName_TestsCorrectNodeName {

    @Mock
    private Appendable accum;

    @Mock
    private Element parent;

    @Test
    public void nodeName_TestsCorrectNodeName() {
        Comment comment = new Comment("Test Data");
        assertEquals("COMMENT", comment.nodeName());
    }

}