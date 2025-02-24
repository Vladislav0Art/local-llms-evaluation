package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedLocationNullTest {

    @Test
    public void locationNullTest() {
        Document document = new Document(null);
        assertEquals("", document.location());
    }

}