package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedSetParser {

    @Test
    public void setParser() {
        Document document = new Document("https://www.example.com");
        Parser parser = new Parser();
        document.parser(parser);
        assertNotNull(document.parser());
    }

}