package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Generated[toString][WithData]

Test {

    @Test
    public void [toString][WithData]Test() {
        String data = "test";
        Comment comment = new Comment(data);
        assertTrue(comment.toString().contains("<!--" + data + "-->"));
    }

}