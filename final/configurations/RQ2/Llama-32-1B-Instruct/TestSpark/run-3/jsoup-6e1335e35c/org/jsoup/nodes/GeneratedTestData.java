package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestData {

    @Test
    public void testData() {
        Node node = new Node();
        node.setData("Value");
        assertThat(node.data(), org.junit.Assert.assertEquals("Value", node.data()));
    }

}