package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("test");
        TextNode newTn = tn.splitText(2);
        assertEquals("te", tn.getWholeText());
        assertEquals("st", newTn.getWholeText());
    }

}