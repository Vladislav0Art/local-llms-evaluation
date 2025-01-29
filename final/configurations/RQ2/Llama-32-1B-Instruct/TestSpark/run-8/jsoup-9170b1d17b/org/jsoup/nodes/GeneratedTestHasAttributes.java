package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestHasAttributes {

    private String value = null;

    public void set(String value) {
        this.value = value;
    }

    public boolean hasAttributes() {
        return true;
    }

    @Test
    public void testHasAttributes() {
        assertEquals(true, hasAttributes());
    }

}