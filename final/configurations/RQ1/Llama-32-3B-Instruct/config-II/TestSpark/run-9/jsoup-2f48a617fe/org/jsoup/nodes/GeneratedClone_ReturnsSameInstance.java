package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedClone_ReturnsSameInstance {

    @Test
    public void Clone_ReturnsSameInstance() {
        Comment comment = new Comment("<!-- Hello, World! -->");
        Comment clone = comment.clone();
        assertEquals(comment, clone);
    }

}