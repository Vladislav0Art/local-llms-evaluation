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

public class GeneratedSetData SetsCorrectData {

    @Test
    public void setData

    SetsCorrectData() {
        Comment comment = new Comment("");
        String expected = "Hello World!";
        comment.setData(expected);
        assertNotNull(comment);
        assertEquals(expected, comment.getData());
    }

}