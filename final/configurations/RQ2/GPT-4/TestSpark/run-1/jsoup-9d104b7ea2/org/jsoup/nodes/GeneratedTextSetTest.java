package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        TextNode tn = new TextNode("test");
        tn.text("newTest");
        assertEquals("newTest", tn.text());
    }

}