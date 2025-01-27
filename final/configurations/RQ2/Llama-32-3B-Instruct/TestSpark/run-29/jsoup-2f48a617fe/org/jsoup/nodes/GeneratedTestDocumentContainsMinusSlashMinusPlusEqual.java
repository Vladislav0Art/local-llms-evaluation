package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.function.Supplier;

import static org.junit.Assert.assertDoesNotThrow;

public class GeneratedTestDocumentContainsMinusSlashMinusPlusEqual {

    private String text;

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

public class Document {
    private String text;

    public Document(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.function.Supplier;

public class CommentTests {

    @Test
    public void testDocumentContainsMinusSlashMinusPlusEqual() {
        assertDoesNotThrow(() -> assertTrue(new Document("<!-- comment -->").toString().contains("-->")));
    }

}