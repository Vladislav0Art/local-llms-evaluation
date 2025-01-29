package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestSetValue {

    private String value = null;

    public void set(String value) {
        this.value = value;
    }

    public boolean hasAttributes() {
        return true;
    }

    @Test
    public void testSetValue() {
        set("new_value");
        assertEquals("new_value", value);
    }

}