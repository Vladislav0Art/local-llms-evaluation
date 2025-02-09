package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedClone_AnnotatedText returnsSameInstance {

    @Test
    public void clone_AnnotatedText

    returnsSameInstance() {
        TextNode node = new TextNode("Hello");
        TextNode cloned = node.clone();
        assertSame(cloned, node);
    }

}