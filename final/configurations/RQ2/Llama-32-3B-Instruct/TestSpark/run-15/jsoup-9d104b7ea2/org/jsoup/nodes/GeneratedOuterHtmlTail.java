package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;

public class GeneratedOuterHtmlTail {

    @Test
    public void outerHtmlTail() {
        TextNode node = new TextNode("");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        documentBuilder.append(node, 1, output);
        assertEquals("<br>", output.toString().trim());
    }

}