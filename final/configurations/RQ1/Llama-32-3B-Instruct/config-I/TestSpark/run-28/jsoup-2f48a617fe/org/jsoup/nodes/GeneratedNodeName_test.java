package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedNodeName_test {

    @Test
    public void nodeName_test() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

}