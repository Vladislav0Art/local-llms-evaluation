package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedDatasetTest {

    @Test
    public void datasetTest() {
        Attributes attrs = new Attributes();
        attrs.put("data-test", "testValue");
        assertTrue(attrs.dataset().containsKey("test"));
    }

}