package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

public class GeneratedTestIOExceptionMessage {

    @Test
    public void testIOExceptionMessage() {
        IOException ioException = new IOException();
        try {
            throw ioException;
        } catch (IOException e) {
            fail("Expected IOException");
        }
    }

}