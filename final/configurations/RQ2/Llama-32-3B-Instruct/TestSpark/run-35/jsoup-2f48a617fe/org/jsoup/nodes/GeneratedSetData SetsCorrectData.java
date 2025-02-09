package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedSetData SetsCorrectData {

    @Test
    public void setData

    SetsCorrectData() {
        Comment comment = new Comment("");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}