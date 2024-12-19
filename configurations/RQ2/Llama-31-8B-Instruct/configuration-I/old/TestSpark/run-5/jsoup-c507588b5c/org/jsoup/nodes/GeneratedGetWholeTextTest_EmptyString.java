package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWholeTextTest_EmptyString {

    @Test
    public void getWholeTextTest_EmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getWholeText());
    }

}