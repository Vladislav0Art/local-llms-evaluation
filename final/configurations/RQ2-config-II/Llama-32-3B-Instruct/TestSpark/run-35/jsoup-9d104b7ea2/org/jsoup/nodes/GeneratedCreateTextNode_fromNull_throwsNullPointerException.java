package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateTextNode_fromNull_throwsNullPointerException {

    @Test
    public void createTextNode_fromNull_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null));
    }

}