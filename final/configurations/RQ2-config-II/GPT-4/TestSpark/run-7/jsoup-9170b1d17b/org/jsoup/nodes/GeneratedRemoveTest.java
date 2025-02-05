package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedRemoveTest {

    @Test
    public void removeTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        attrs.remove("key");
        assertFalse(attrs.hasKey("key"));
    }

}