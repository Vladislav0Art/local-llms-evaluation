package org.jsoup.safety;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Thunk;

public class GeneratedTestAttributesWithProtocol {

    @Test
    public void testAttributesWithProtocol() {
        String protocol = "https";
        Element element = new Element();
        Attribute attribute = new Attribute(protocol);
        Assertions.assertEquals(protocol, element.absUrl(attribute.getKey()));
    }

}