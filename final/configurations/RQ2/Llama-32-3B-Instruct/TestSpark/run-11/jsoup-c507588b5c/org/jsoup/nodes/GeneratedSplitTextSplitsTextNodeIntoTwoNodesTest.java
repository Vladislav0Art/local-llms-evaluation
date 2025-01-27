package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtilImpl;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.mockito.Mockito;

public class GeneratedSplitTextSplitsTextNodeIntoTwoNodesTest {

    @Test
    public void splitTextSplitsTextNodeIntoTwoNodesTest() {
        TextNode node = new TextNode("Hello, World!");
        int offset = 6;
        TextNode split1 = node.splitText(offset);
        TextNode split2 = node.splitText(0);
        assertNotNull(split1);
        assertNotNull(split2);
    }

}