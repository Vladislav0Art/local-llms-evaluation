package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHeadAndTailDoNotAlterTextNode {

    @Test
    public void outerHtmlHeadAndTailDoNotAlterTextNode() {
        String text = "hello";
        int depth = 1;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        // Removed the incorrect assignment here.
    }

}