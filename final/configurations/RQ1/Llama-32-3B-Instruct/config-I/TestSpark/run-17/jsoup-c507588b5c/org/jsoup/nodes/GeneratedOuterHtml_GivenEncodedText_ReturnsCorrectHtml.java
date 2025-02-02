package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtml_GivenEncodedText_ReturnsCorrectHtml {

    public String normaliseWhitespace(String input) {
        // implementation of StringUtil.normaliseWhitespace method
        return input.replaceAll("\\s+", " ");
    }

    @Test
    public void outerHtml_GivenEncodedText_ReturnsCorrectHtml() throws IOException {
        String encodedText = "&lt;Hello&gt;, &amp;World!&amp;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();
        textNode.outerHtmlHead(out, 0, settings);
        assertEquals("<p>Hello, World!</p>", out.toString());
    }
}

public class StringUtil {
    public static String normaliseWhitespace(String input) {
        // implementation of normalising whitespace
        return input.replaceAll("\\s+", " ");
    }
}

public class Document {
    public interface OutputSettings {
    }

    public static class OutputSettings implements OutputSettings {
    }

}