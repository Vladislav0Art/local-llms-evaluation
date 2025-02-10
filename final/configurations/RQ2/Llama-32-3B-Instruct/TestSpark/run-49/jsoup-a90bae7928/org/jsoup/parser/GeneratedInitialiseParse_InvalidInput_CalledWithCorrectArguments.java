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
public class GeneratedInitialiseParse_InvalidInput_CalledWithCorrectArguments {

    @Mock
    private TreeBuilder treeBuilderMock;

    @Test
    public void initialiseParse_InvalidInput_CalledWithCorrectArguments() throws IOException {
        when(treeBuilderMock.initialiseParse(any(), any(), any())).thenReturn(new XmlTreeBuilder());
        new XmlTreeBuilder().initialiseParse(null, "baseUri", new Parser());
        verify(treeBuilderMock).initialiseParse(eq(null), eq("baseUri"), eq(new Parser()));
    }

}