package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetDataUpdatesData {

    @Test
    public void setDataUpdatesData() {
        String originalData = "This is a comment";
        Comment comment = new Comment(originalData);
        String newData = "New data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}