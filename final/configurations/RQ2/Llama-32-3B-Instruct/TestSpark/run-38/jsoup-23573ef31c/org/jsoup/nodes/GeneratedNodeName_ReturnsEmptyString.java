package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNodeName_ReturnsEmptyString {

    @Test
    public void nodeName_ReturnsEmptyString() {
        Document document = new Document("");
        assertEquals("", document.nodeName());
    }

}