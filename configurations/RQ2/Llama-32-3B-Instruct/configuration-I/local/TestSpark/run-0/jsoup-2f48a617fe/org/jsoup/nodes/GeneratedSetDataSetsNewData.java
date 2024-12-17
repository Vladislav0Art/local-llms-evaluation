package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetDataSetsNewData {

    @Test
    public void setDataSetsNewData() {
        Comment comment = new Comment("This is a comment");
        comment.setData("This is another comment");
        String data = "This is another comment";
        assertTrue(comment.getData().equals(data));
    }

}