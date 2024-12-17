package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAsXmlDeclarationNotComment {

    @Test
    public void asXmlDeclarationNotComment() {
        Comment comment = new Comment("Hello World");
        assertNull(comment.asXmlDeclaration());
    }
}

public class MockDocument implements Document {

    private String output;

    public MockDocument(String output) {
        this.output = output;
    }

    @Override
    public Appendable getOutput() {
        return output;
    }
}

class depth extends LeafNodeAdapter {
    @Override
    void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {
        accum.append(output);
    }

}