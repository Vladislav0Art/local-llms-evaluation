package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedLocationDocument_test {

    @Test
    public void locationDocument_test() {
        Document document = Document.createShell("http://example.com");
        String location = document.location();
        assertEquals("", location);
    }

}