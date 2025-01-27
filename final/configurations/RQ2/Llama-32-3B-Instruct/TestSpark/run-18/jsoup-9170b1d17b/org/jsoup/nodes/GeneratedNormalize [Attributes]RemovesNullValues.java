package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedNormalize [Attributes]

RemovesNullValues {

    @Test
    public void normalize[ Attributes]RemovesNullValues() {
        Attributes attributes = new Attributes();
        attributes.put("key", null);
        attributes.normalize();
        assertFalse(attributes.hasKey("key"));
    }

}