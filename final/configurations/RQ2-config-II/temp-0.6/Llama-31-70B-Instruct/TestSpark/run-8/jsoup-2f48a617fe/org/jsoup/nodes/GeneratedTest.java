package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Mock
    private String data;
    private Comment comment;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        comment = new Comment(data);
    }

    @Test
    public void testNodeName() {
        String actual = comment.nodeName();
        String expected = "#comment";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetData() {
        String actual = comment.getData();
        String expected = data;
        assertEquals(expected, actual);
    }

    @Test
    public void testSetData() {
        String newData = "new data";
        comment.setData(newData);
        String actual = comment.getData();
        String expected = newData;
        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        String actual = comment.toString();
        String expected = data;
        assertEquals(expected, actual);
    }

    @Test
    public void testClone() {
        Comment actual = comment.clone();
        Comment expected = comment;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsXmlDeclaration() {
        assertTrue(comment.isXmlDeclaration());
    }

}