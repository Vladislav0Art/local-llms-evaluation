package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlankTextNodeReturnsTrueForEmptyString {

    @Test
    public void isBlankTextNodeReturnsTrueForEmptyString() {
        TextNode emptyText = new TextNode("");
        assertTrue(emptyText.isBlank());
    }

}