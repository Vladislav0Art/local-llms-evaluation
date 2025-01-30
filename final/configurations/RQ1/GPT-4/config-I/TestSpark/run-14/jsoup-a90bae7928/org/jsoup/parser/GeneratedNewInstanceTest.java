package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.jsoup.Jsoup;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        try {
            XmlTreeBuilder builder = new XmlTreeBuilder();
            assertTrue(builder.newInstance() instanceof XmlTreeBuilder);
        } catch (Exception e) {
            fail("Test failed due to exception: " + e.getMessage());
        }
    }

}