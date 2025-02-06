package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetDataReturnsCorrectValue {

    @Test
    public void setDataReturnsCorrectValue() {
        Comment comment = new Comment("Old data");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}