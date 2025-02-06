package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedCreateFromEncoded {

    @Test
    public void createFromEncoded() throws IOException {
        String encoded = "UTF-8%3A%22Hello%22";
        TextNode textNode = TextNode.createFromEncoded(encoded);
        assertEquals(new TextNode("Hello"), textNode);
    }
}

class StubAppendable implements Appendable {
    private StringBuilder sb;

    public StubAppendable(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public Writer getAppendable() throws IOException {
        return new StringWriter();
    }

    @Override
    public void append(char c) throws IOException {
    }

    @Override
    public void append(CharSequence csq) throws IOException {
    }

    @Override
    public void append(CharSequence csq, int start, int end) throws IOException {
    }
}

class StubDocumentOutputSettings implements Document.OutputSettings {
    private boolean outputEnabled;

    public StubDocumentOutputSettings(boolean outputEnabled) {
        this.outputEnabled = outputEnabled;
    }

    @Override
    public boolean isOutputEnabled() {
        return outputEnabled;
    }

}