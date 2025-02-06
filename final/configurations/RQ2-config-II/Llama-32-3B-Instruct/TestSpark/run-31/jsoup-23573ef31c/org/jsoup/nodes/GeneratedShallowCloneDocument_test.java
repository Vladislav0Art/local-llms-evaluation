package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedShallowCloneDocument_test {

    @Test
    public void shallowCloneDocument_test() {
        Document original = Document.createShell("http://example.com");
        Document cloned = original.shallowClone();
        assertNotNull(cloned);
        assertTrue(cloned instanceof Document);
    }

}