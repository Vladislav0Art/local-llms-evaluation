package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertEquals(" testKey=\"testValue\"", attrs.html());
    }

}