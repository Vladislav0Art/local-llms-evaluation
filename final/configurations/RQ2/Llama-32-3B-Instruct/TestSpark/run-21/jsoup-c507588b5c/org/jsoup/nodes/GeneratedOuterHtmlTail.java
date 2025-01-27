package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail {

    private String text;
    private int length;
    private Node node;

    public TextNode(String text) {
        this.text = text;
        this.length = text.length();
        this.node = null;
    }

    public String nodeName() {
        return "text";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String text() {
        return this.text;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int length() {
        return this.length;
    }
}

public class StringUtil {

    public static String normaliseWhitespace(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static String stripLeadingWhitespace(String text) {
        return text.trim().replaceAll("^\\s+", "");
    }
}

class Document {

    private ArrayList<Appendable> accumList;

    public void outerHtmlHead(ArrayList<Appendable> accumList, int depth, Document.OutputSettings out) throws IOException {
    }

    public void outerHtmlTail(ArrayList<Appendable> accumList, int depth, Document.OutputSettings out) throws IOException {
    }

    public static class OutputSettings {

    }
}

class Appendable implements java.io.Appendable {

}

class Node {

}

public class GeneratedTest {

    @Test
    public void outerHtmlTail() {
        Document document = new Document();
        ArrayList<Appendable> accumList = new ArrayList<>();
        document.outerHtmlTail(accumList, 0, null);
        assert !accumList.isEmpty();
    }

}