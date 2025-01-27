package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedToString_returnsCorrectString {

    @Test
    public void toString_returnsCorrectString() {
        Comment comment = new Comment("");
        assertEquals("<!-- -->", comment.toString());
    }

}