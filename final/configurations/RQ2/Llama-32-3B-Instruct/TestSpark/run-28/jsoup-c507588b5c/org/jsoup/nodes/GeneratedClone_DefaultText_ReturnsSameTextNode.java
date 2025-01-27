package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedClone_DefaultText_ReturnsSameTextNode {

    @Test
    public void clone_DefaultText_ReturnsSameTextNode() {
        TextNode originalTextNode = new TextNode("Default text");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode, clonedTextNode);
    }

}