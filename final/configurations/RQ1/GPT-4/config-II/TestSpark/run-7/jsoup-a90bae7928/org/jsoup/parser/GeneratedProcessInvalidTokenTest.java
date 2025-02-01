package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedProcessInvalidTokenTest {

    @Test
    public void processInvalidTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = Mockito.mock(Token.class);
        Mockito.when(token.type).thenReturn(null);

        builder.process(token);
    }

}