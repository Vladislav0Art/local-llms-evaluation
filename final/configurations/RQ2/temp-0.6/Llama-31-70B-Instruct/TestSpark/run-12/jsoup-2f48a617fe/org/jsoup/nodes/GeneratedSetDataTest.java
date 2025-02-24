package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        Comment comment2 = comment.setData("data2");
        assertEquals("data2", comment2.getData());
    }

}