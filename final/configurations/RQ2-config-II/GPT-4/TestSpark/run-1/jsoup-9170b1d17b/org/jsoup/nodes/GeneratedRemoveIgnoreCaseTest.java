package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        attr.removeIgnoreCase("KEY");
        assertFalse(attr.hasKey("key"));
    }

}