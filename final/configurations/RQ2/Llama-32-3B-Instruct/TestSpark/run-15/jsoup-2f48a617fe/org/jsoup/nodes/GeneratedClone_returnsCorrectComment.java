package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedClone_returnsCorrectComment {

    @Test
    public void clone_returnsCorrectComment() {
        Comment comment1 = new Comment("");
        Comment comment2 = comment1.clone();
        assertNotNull(comment2);
        assertEquals(comment1, comment2);
    }

}