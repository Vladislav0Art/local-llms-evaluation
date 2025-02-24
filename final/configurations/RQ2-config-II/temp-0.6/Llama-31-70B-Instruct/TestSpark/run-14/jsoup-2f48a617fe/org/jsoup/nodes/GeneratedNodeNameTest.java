package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeNameTest {

    @Mock
    private XmlDeclaration xmlDeclaration;

    @InjectMocks
    private Comment comment;

    @Test
    public void nodeNameTest() {
        String expected = "#comment";
        String actual = comment.nodeName();
        assertEquals(expected, actual);
    }

}