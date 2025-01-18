package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;
import java.util.ArrayList;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        Document document = new Document("http://mock.base.uri");
        assertNotNull(document.body());
    }

}