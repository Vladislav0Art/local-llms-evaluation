package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetValues {

    @Test
    public void testGetValues() {
        Attributes attributes = new Attributes();
        attributes.set("a", "1");
        attributes.set("b", 2);

        String[] values = attributes.getValues();

        for (String value : values) {
            System.out.println(value);
        }
    }

}