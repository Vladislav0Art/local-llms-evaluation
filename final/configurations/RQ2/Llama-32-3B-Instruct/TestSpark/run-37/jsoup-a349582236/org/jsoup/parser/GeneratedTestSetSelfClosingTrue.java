package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedTestSetSelfClosingTrue {

    @Test
    public void testSetSelfClosingTrue() {
        Tag tag = new Tag();
        tag.setSelfClosing(true);
        assertTrue(tag.isSelfClosing());
    }
}

public class MockParseSettings {
    private boolean settings;

    public void set(boolean settings) {
        this.settings = settings;
    }

    public boolean get() {
        return settings;
    }
}

class ParseSettings {
    private boolean settings;

    public void set(boolean settings) {
        this.settings = settings;
    }

    public boolean get() {
        return settings;
    }

}