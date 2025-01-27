package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewNodeWithoutTextTest {

    @Test
    public void newNodeWithoutTextTest() {
        TextNode node = new TextNode("");
        assertNull(node.text());
    }

}