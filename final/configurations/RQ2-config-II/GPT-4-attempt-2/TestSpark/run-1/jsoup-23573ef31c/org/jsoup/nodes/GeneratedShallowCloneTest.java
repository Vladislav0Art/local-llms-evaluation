package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Document doc = new Document("");
        assertNotNull(doc.shallowClone());
    }

}