package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import java.io.ByteArrayBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

public class GeneratedTextReturnsNormalisedWhitespace[]

Test {

    @Test
    public void textReturnsNormalisedWhitespace[] Test() {
        String normalised = StringUtil.normaliseWhitespace("   ");
        assertEquals(" ", TextNode.stripLeadingWhitespace(normalised));
    }
}

class MockTextNode extends TextNode {
    private boolean isBlank;

    public MockTextNode(String text) {
        super(text);
        this.isBlank = true;
    }

    @Override
    public boolean isBlank() {
        return isBlank;
    }

}