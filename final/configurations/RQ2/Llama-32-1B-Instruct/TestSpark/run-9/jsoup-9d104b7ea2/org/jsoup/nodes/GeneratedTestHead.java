package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestHead {

    private String[] head = new String[]{"<head>", "</head>"};
    private String[] body = new String[]{"<body>", "</body>"};

    @Before
    public void setup() {
        this.head[0] = "<html><head></head><body></body></html>";
        this.body[0] = "<html><body>Hello World!</body></html>";
    }

    @Test
    public void testHead() {
        assertEquals(head[1], head[0].trim());
    }

}