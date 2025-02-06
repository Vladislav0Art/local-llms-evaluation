package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToStringReturnsCorrectString {

    @Test
    public void toStringReturnsCorrectString() {
        Comment comment = new Comment("data");
        assertEquals("<!-- data -->", comment.toString());
    }

}