package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        Node root = new Root();
        root.addChild(new Left("left", null));
        root.addChild(new Right("right", null));

        String expected = "left<br>right";
        assertEquals(expected, root.getWholeText());
    }

}