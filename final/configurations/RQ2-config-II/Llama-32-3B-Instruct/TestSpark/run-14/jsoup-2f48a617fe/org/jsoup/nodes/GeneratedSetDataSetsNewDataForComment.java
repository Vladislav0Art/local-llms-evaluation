package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedSetDataSetsNewDataForComment {

    @Test
    public void setDataSetsNewDataForComment() {
        String oldData = "old";
        String newData = "new";
        Comment comment = new Comment(oldData);
        comment.setData(newData);
        assertNotEquals(oldData, comment.getData());
        assertEquals(newData, comment.getData());
    }

}