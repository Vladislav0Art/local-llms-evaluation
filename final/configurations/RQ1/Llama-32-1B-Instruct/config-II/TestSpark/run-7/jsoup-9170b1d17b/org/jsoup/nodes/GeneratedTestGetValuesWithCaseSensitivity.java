package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetValuesWithCaseSensitivity {

    @Test
    public void testGetValuesWithCaseSensitivity() {
        Attributes attributes = new Attributes();
        attributes.set("A", "1");
        attributes.set("B", 2);

        String[] values = attributes.getValues();

        for (String value : values) {
            System.out.println(value);
        }
    }

}