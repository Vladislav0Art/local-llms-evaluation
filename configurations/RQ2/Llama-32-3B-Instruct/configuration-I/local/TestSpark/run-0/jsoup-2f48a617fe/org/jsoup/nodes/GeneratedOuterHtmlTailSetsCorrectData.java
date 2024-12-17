package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailSetsCorrectData {

    @Test
    public void outerHtmlTailSetsCorrectData() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        public Document.OutputSettings settings = public Document.OutputSettings.get();
        public Comment comment = new public Comment("This is a comment");
        comment.outerHtmlTail(outContent, 0, settings);
        String expectedOut = "/*-- This is a comment --*/\n";
        assertEquals(expectedOut, outContent.toString());
    }

}