package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode tn = new TextNode("test");
        tn.getWholeText();
        assertEquals("test", tn.text());
    }

}