package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import javax.annotation.Nullable;

public class GeneratedSetDataSetsCommentData {

    @Test
    public void setDataSetsCommentData() {
        String data = "Some data";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}