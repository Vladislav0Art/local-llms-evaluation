package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetDataMethod_SetAndReturnCorrectValueTest {

    @Test
    public void setDataMethod_SetAndReturnCorrectValueTest() {
        Comment comment = new Comment("This is a test");
        String newValue = "New value";
        comment.setData(newValue);
        assertEquals(newValue, comment.getData());
    }

}