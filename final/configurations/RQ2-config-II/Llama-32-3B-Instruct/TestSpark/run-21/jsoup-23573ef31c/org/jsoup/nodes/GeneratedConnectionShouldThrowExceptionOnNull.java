package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedConnectionShouldThrowExceptionOnNull {

    @Test
    public void connectionShouldThrowExceptionOnNull() {
        assertThrows(NullPointerException.class, () -> new Document("http://example.com").connection(null));
    }

}