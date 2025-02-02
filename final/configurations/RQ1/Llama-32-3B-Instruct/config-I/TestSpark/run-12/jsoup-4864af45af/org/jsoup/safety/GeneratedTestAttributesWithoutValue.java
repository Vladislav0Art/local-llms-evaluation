package org.jsoup.safety;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Thunk;

public class GeneratedTestAttributesWithoutValue {

    @Test
    public void testAttributesWithoutValue() {
        Element element = new Element();
        Assertions.assertThrows(NullPointerException.class, () -> element.getAttributeValue("key"));
    }

}