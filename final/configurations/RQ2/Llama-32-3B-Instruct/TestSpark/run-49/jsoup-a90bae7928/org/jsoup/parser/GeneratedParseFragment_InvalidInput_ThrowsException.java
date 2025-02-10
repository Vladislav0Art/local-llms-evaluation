package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseFragment_InvalidInput_ThrowsException {

    @Mock
    private TreeBuilder treeBuilderMock;

    @Test
    public void parseFragment_InvalidInput_ThrowsException() throws IOException {
        try {
            new XmlTreeBuilder().parseFragment(null, "baseUri", new Parser());
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }

}