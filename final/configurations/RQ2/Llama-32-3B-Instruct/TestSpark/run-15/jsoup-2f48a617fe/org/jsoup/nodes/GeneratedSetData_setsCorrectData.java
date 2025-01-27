package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedSetData_setsCorrectData {

    @Test
    public void setData_setsCorrectData() {
        Comment comment = new Comment("");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

}