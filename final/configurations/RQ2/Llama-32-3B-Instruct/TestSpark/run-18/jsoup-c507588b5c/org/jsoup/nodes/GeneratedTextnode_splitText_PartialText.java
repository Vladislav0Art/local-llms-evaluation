package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedTextnode_splitText_PartialText {

    @Test
    public void textnode_splitText_PartialText() throws IOException {
        TextNode textNode = new TextNode("test");
        String result = textNode.splitText(1);
        assertTrue(result.length() == 1);
    }

    static class AppendableStub implements Appendable {
        StringBuilder sb = new StringBuilder();

        @Override
        public Writer writer() {
            return new StringWriter(sb);
        }
    }

    public void testIsBlank(String input) throws IOException {
        TextNode textNode = new TextNode(input);
        assertTrue(textNode.isBlank());
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

}