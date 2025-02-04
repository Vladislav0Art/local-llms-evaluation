package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Generated[setData][WithData]

Test {

    @Test
    public void [setData][WithData]Test() throws IOException {
        String data = "test";
        Comment comment = new Comment(data);
        Map<String, String> expectedData = new HashMap<>();
        comment.setData(expectedData.get("data"));
        assertTrue(comment.getData().equals(expectedData.get("data")));
    }

}