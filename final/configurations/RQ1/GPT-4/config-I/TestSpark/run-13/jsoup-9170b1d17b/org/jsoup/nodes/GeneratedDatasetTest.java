package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attr = new Attributes();
        attr.put("data-key", "value");
        assertEquals(1, attr.dataset().size());
    }

}