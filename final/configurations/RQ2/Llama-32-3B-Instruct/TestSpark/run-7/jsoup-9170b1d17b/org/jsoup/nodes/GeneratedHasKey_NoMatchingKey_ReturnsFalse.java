package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

public class GeneratedHasKey_NoMatchingKey_ReturnsFalse {

    @Test
    public void hasKey_NoMatchingKey_ReturnsFalse() {
        Attributes attrs = new Attributes();
        assertTrue(!attrs.hasKey(""));
    }

}