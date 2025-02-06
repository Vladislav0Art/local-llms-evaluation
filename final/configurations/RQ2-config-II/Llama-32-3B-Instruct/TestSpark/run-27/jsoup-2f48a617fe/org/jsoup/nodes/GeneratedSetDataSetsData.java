package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetDataSetsData {

    @Test
    public void setDataSetsData() {
        Comment comment = new Comment("oldText");
        comment.setData("newText");
        assertEquals("newText", comment.getData());
    }

}