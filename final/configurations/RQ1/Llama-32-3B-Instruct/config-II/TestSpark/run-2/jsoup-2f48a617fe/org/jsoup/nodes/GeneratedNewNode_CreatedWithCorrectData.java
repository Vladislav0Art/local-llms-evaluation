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

public class GeneratedNewNode_CreatedWithCorrectData {

    @Test
    public void newNode_CreatedWithCorrectData() {
        Comment comment = new Comment("Hello World!");
        assertNotNull(comment);
        assertEquals("Hello World!", comment.getData());
    }

}