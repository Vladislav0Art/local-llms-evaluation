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
public class GeneratedParseFragment_ValidInput_ReturnsList {

    @Mock
    private TreeBuilder treeBuilderMock;

    @Test
    public void parseFragment_ValidInput_ReturnsList() throws IOException {
        when(treeBuilderMock.parseFragment(any(), any(), any())).thenReturn(List.of());
        Document result = new XmlTreeBuilder().parseFragment("input", "baseUri", new Parser());
        assertNotNull(result);
    }

}