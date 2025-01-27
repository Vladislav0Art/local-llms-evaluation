package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;

public class GeneratedClone_test {

    @Test
    public void clone_test() throws Exception {
        Document document = new Document();
        Appendable accum = new ArrayList<>();
        int depth = 0;
        Document.OutputSettings out = null;
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

}