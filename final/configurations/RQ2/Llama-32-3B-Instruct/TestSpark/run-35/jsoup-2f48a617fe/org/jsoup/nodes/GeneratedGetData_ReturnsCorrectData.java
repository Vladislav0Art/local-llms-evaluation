package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetData_ReturnsCorrectData {

    @Test
    public void getData_ReturnsCorrectData() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}