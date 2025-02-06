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

public class GeneratedGetDataReturnsProvidedString {

    @Test
    public void getDataReturnsProvidedString() {
        String data = "test";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}