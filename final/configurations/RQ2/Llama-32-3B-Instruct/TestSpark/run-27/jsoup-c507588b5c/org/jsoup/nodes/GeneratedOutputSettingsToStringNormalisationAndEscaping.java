package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedOutputSettingsToStringNormalisationAndEscaping {

    @Test
    public void outputSettingsToStringNormalisationAndEscaping() throws IOException {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        Document.OutputSettings settings = new Document.OutputSettings();
        StringBuilder builder = new StringBuilder();
        node.outerHtmlHead(builder, 0, settings);
        assertEquals("<p>Hello World</p>", builder.toString());
    }

}