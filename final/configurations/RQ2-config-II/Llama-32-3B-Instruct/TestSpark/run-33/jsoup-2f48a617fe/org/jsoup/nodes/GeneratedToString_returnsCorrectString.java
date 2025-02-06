package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;

public class GeneratedToString_returnsCorrectString {

    @Test
    public void toString_returnsCorrectString() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.toString());
    }

}