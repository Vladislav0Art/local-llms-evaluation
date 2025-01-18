package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("testKey", "testValue");
        Attributes attrs2 = attrs1.clone();
        assertEquals(attrs1, attrs2);
    }

}