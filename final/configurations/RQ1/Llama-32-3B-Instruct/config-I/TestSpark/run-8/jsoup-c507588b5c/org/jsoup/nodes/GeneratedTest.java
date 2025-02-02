package org.jsoup.nodes;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedTest {

    private String text;

    public Node() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public Appendable splitText(int index) throws Exception {
        StringBuilder sb = new StringBuilder(text);
        return sb.subSequence(0, index).append(", ");
    }
}

public class DocumentOutputSettings {
    private StringBuilder append;

    public DocumentOutputSettings() {
    }

    public void append(String text) {
        if (append == null) {
            append = new StringBuilder();
        }
        append.append(text);
    }

    public String getAppend() {
        return append.toString();
    }
}

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DocumentTest {

}