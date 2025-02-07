package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.util.regex.Pattern;

public class GeneratedTestCloneReturnsSameInstance {

    @Test
    public void testCloneReturnsSameInstance() {
        TextNode original = new TextNode("Hello World");
        TextNode cloned = original.clone();
        assertTrue(original == cloned);
    }

}