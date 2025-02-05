package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.*;

public class GeneratedGetInValidKeyTest {

    @Test
    public void getInValidKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertNull(attributes.get("notExist"));
    }

}