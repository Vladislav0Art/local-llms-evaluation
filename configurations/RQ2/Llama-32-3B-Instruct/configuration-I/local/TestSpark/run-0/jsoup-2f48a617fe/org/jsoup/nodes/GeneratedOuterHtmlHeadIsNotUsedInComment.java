package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadIsNotUsedInComment {

    @Test
    public void outerHtmlHeadIsNotUsedInComment() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        public Document.OutputSettings settings = public Document.OutputSettings.get();
        public Comment comment = new public Comment("This is a comment");
        comment.outerHtmlHead(outContent, 0, settings);
        assertEquals(0, outContent.size());
    }

}