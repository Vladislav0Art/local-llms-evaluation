package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedTextTextNodeTextCannotBeEmpty_ThrowsNullPointerExceptionWhenSplitting {

    @Test
    public void textTextNodeTextCannotBeEmpty_ThrowsNullPointerExceptionWhenSplitting() {
        TextNode textNode = new TextNode("");
        assertThrows(NullPointerException.class, () -> textNode.splitText(0));
    }
}

}