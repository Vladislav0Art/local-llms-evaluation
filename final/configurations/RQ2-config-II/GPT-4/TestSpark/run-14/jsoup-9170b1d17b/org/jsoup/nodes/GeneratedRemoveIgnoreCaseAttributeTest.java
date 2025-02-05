package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedRemoveIgnoreCaseAttributeTest {

    @Test
    public void removeIgnoreCaseAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key_five", "value_five");
        attributes.removeIgnoreCase("KEY_FIVE");
        assertFalse(attributes.hasKey("key_five"));
    }

}