package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateShellInvalidUriShouldThrowException {

    @Test
    public void createShellInvalidUriShouldThrowException() {
        assertThrows(InvalidUriException.class, () -> Document.createShell(" invalidUri "));
    }

}