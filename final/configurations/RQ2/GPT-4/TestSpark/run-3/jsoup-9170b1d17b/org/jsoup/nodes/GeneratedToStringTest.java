package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertEquals(" testKey=\"testValue\"", attrs.toString());
    }

}