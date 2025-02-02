package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.NodeUtils;

public class GeneratedTestConstructorWithData {

    public static class AppendableStub implements Appendable {
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();

        @Override
        public void append(CharSequence cs) {
            out.append(cs);
        }

        @Override
        public void append(CharSequence cs, int start, int end) {
            out.append(cs, start, end);
        }

        public String getContents() {
            return out.toString();
        }
    }

    @Test
    public void testConstructorWithData() {
        Comment comment = new Comment("Hello World");
        assertNotNull(comment.value);
        assertEquals("Hello World", comment.getData());
    }

}