package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedConstructor_CreatedWithCorrectData {

    @Test
    public void constructor_CreatedWithCorrectData() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}