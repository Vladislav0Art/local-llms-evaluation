package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("sample");
        TextNode clone = tn.clone();
        assertNotSame(tn, clone);
        assertEquals(tn.text(), clone.text());
    }

}