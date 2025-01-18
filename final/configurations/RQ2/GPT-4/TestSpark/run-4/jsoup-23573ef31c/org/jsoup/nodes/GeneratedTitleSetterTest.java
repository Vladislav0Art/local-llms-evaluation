package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;
import java.util.ArrayList;

public class GeneratedTitleSetterTest {

    @Test
    public void titleSetterTest() {
        Document document = new Document("http://mock.base.uri");
        document.title("Mock Title");
        assertEquals("Mock Title", document.title());
    }

}