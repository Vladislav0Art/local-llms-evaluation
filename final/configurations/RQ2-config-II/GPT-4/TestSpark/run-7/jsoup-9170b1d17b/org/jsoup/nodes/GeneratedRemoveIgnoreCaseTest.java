package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.add("KEY", "value");
        attrs.removeIgnoreCase("key");
        assertFalse(attrs.hasKeyIgnoreCase("key"));
    }

}