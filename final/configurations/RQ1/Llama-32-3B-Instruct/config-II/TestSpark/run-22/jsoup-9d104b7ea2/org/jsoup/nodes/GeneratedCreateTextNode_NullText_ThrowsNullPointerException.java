package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateTextNode_NullText_ThrowsNullPointerException {

    @Test
    public void createTextNode_NullText_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null));
    }

}