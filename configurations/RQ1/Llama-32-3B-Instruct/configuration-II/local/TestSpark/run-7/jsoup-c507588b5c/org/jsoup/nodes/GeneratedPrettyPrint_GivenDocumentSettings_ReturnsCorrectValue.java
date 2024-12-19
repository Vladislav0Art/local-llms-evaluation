package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedPrettyPrint_GivenDocumentSettings_ReturnsCorrectValue {

    @Test
    public void prettyPrint_GivenDocumentSettings_ReturnsCorrectValue() {
        boolean expected = true;
        Document.OutputSettings outSettings = new Document.OutputSettings(expected);
        boolean actual = outSettings.prettyPrint();
        assertEquals(expected, actual);
    }

}