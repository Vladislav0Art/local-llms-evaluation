package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetData_SetsCorrectData {

    @Test
    public void setData_SetsCorrectData() {
        Comment comment = new Comment();
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}