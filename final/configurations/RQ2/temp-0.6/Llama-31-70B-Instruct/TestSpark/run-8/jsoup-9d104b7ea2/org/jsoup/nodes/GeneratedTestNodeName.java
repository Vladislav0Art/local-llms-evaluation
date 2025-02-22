package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.Tag;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestNodeName {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

}