package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedGetInvalidKeyTest {

    @Test
    public void getInvalidKeyTest() {
        Attributes attrs = new Attributes();
        attrs.get("invalid");
    }

}