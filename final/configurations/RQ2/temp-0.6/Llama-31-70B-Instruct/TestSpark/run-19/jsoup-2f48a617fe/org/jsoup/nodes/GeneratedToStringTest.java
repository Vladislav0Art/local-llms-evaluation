package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() throws IOException {
        Comment comment = new Comment("Data");
        String expectedString = "<!--Data-->";
        String actualString = comment.toString();
        assertEquals(expectedString, actualString);
    }

}