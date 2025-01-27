package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNodeName_GivenTextNode_ReturnsCorrectName {

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectName() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

}