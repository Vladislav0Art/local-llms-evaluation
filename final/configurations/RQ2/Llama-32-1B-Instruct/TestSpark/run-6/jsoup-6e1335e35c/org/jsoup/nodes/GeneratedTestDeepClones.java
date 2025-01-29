package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestDeepClones {

    @Test
    public void testDeepClones() {
        Element parent = new Element("parent");
        clone(parent);
        Assert.assertFalse(getAllElements().stream()
                        .map(Element::toString)
                        .collect(Collectors.toSet()))
                .containsAll(Arrays.asList(parent.toString())));
    }

}