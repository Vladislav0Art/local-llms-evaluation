package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

public class GeneratedTestShallowClones {

    @Test
    public void testShallowClones() {
        Element parent = new Element("parent");
        clone(parent);
        Assert.assertTrue(getAllElements().stream()
                .map(Element::toString)
                .collect(Collectors.toSet())
                .containsAll(Arrays.asList(parent.toString())));
    }

}