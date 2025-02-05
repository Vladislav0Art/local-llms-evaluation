package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIllegalSplitTextTest {

    @Test
    public void illegalSplitTextTest() {
        TextNode tn = new TextNode("Lorem ipsum");
        tn.splitText(-1);
    }

}