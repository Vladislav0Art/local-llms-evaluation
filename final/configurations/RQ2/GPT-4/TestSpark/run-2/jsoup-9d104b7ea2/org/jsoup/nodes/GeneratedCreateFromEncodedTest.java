package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    // Test for constructor

    @Test
    public void createFromEncodedTest() {
        TextNode tn = TextNode.createFromEncoded("test&amp;text");
        Assert.assertEquals("test&text", tn.text());
    }

    private static class IOExceptionThrowingAppendable implements Appendable {
        @Override
        public Appendable append(CharSequence csq) throws IOException {
            throw new IOException();
        }

        @Override
        public Appendable append(CharSequence csq, int start, int end) throws IOException {
            throw new IOException();
        }

        @Override
        public Appendable append(char c) throws IOException {
            throw new IOException();
        }
    }

}