package org.jsoup.nodes;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedDeduplicateParseSettings {

    @Test
    public void deduplicateParseSettings() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.deduplicate(new ParseSettings()));
    }
}

class Attribute {
    private String attribute;

    public Attribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return attribute;
    }
}

}