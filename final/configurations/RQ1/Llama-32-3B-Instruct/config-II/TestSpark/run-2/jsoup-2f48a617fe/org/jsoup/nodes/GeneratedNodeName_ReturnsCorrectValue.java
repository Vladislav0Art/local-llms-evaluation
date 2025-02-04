package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedNodeName_ReturnsCorrectValue {

    @Test
    public void nodeName_ReturnsCorrectValue() {
        Comment comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

}