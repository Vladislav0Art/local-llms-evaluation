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
public class GeneratedProcess_InvalidToken_ReturnsFalse {

    @Mock
    private TreeBuilder treeBuilderMock;

    @Test
    public void process_InvalidToken_ReturnsFalse() {
        boolean result = new XmlTreeBuilder().process(new TokenComment());
        assertFalse(result);
    }

}