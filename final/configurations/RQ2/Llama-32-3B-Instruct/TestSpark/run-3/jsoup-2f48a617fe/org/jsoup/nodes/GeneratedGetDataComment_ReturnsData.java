package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.util.Arrays;

public class GeneratedGetDataComment_ReturnsData {

    @Test
    public void getDataComment_ReturnsData() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}