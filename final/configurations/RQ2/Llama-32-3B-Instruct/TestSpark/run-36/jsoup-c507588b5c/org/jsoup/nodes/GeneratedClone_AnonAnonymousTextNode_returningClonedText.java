package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedClone_AnonAnonymousTextNode_returningClonedText {

    @Test
    public void clone_AnonAnonymousTextNode_returningClonedText() {
        TextNode node = new TextNode("");
        TextNode cloned = node.clone();
        assertEquals("", cloned.text());
    }
}

class Appendable implements org.jsoup.helper.Appendable {
}

class Document extends org.jsoup.Document {
}

}