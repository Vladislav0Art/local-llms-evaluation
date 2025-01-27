package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlankReturnsTrueForEmptyString {

    @Test
    public void isBlankReturnsTrueForEmptyString() {
        assertTrue(TextNode.class.newInstance().isBlank());
    }

}