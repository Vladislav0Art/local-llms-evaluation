package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_returnsFalseForNonEmptyString {

    @Test
    public void isBlank_returnsFalseForNonEmptyString() {
        assertFalse(TextNode.isBlank("Hello"));
    }

}