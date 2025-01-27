package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsBlank_DefaultText_ReturnsFalse {

    @Test
    public void isBlank_DefaultText_ReturnsFalse() {
        TextNode textNode = new TextNode("Default text");
        assertFalse(textNode.isBlank());
    }

}