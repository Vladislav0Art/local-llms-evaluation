package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetDataShouldUpdateDataCorrectly {

    @Test
    public void setDataShouldUpdateDataCorrectly() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = Document.createDocument(outContent);
        Element element = document.createElement("div");
        Comment comment = new Comment("some data");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}