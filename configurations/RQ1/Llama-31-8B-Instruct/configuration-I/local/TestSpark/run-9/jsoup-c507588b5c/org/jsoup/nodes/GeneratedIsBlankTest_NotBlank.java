package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

@RunWith(JUnit4.class)
public class GeneratedIsBlankTest_NotBlank {

    @Test
    public void isBlankTest_NotBlank() {
        TextNode textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

}