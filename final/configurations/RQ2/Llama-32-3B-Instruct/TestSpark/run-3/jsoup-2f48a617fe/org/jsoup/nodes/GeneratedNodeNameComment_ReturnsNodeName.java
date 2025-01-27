package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.util.Arrays;

public class GeneratedNodeNameComment_ReturnsNodeName {

    @Test
    public void nodeNameComment_ReturnsNodeName() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

}