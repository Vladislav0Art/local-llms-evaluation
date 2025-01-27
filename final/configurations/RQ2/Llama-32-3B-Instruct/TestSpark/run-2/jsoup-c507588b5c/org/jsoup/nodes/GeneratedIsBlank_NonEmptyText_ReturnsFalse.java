package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedIsBlank_NonEmptyText_ReturnsFalse {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

    @Test
    public void isBlank_NonEmptyText_ReturnsFalse() {
        assertFalse(TextNode.isBlank("abc").equals(false));
    }

}