package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.util.Arrays;

public class GeneratedSetDataCommentSetsData {

    @Test
    public void setDataCommentSetsData() {
        Comment comment = new Comment("data1");
        comment.setData("data2");
        assertEquals("data2", comment.getData());
    }

}