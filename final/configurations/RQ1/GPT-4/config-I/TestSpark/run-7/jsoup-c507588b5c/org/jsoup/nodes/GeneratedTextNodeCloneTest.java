package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeCloneTest {

    @Test
    public void textNodeCloneTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        TextNode clonedTn = tn.clone();
        assertFalse(tn == clonedTn);
        assertEquals(tn.getWholeText(), clonedTn.getWholeText());
    }

}