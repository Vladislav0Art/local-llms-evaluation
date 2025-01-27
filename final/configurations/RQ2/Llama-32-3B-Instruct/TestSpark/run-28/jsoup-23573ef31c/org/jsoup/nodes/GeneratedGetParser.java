package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetParser {

    @Test
    public void getParser() {
        Document document = new Document("https://www.example.com");
        Parser parser = document.parser();
        assertNotNull(parser);
    }

}