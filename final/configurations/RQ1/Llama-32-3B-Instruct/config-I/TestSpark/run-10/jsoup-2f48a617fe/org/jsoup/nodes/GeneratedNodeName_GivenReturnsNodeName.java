package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNodeName_GivenReturnsNodeName {

    public static interface Appendable extends StringBuilder {
        void append(String data);
    }

    @Test
    public void nodeName_GivenReturnsNodeName() {
        Comment comment = new Comment("");
        assertEquals("#comment", comment.nodeName());
    }

}