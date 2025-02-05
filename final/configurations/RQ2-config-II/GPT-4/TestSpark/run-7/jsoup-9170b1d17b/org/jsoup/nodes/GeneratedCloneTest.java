package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Attributes clonedAttrs = attrs.clone();
        assertTrue(clonedAttrs.hasKey("key"));
    }

}