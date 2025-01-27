package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsBlank_GivenTextNode_ReturnsTrueIfTextIsBlank {

    @Test
    public void isBlank_GivenTextNode_ReturnsTrueIfTextIsBlank() {
        String text = "";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}