package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() throws IOException {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        String html = attrs.html();
        assertTrue(html.contains("key=\"value\""));
    }

}