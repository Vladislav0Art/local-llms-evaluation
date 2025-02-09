package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateShellWithInvalidBaseUri_ThrowsNullPointerException {

    @Test
    public void createShellWithInvalidBaseUri_ThrowsNullPointerException() {
        String baseUri = "";
        try {
            Document.createShell(baseUri);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}