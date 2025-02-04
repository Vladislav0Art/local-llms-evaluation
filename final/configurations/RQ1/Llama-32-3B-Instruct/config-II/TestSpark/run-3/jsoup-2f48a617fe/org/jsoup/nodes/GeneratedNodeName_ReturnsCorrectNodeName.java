package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNodeName_ReturnsCorrectNodeName {

    @Test
    public void nodeName_ReturnsCorrectNodeName() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

}