package org.jsoup.nodes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;

    @BeforeEach
    void setUp() {
        textNode = new TextNode("some text");
    }

    @AfterEach
    void tearDown() {
        textNode = null;
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.prettyPrint(true);
        textNode.outerHtmlHead(appendable, 0, outputSettings);
        Mockito.verify(appendable).append("some text");
    }

}