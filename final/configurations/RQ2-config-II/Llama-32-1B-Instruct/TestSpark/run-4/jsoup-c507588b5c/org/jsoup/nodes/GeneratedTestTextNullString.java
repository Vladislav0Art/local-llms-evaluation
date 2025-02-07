package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestTextNullString {

    @Test
    public void testTextNullString() {
        try {
            TextNode.class.getMethod("text", String.class).invoke(null);
            assert false : "Expected exception";
        } catch (Exception e) {
            // expected
        }
    }

}