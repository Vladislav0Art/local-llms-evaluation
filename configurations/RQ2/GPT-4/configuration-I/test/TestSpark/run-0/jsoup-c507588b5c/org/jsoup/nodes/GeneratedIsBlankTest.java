package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedIsBlankTest {

    @Test
    public void IsBlankTest() {
        TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());
    }

}