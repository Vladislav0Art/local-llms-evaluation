package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        Comment comment = new Comment("test");
        String actualValue = comment.nodeName();
        String expectedValue = "#comment";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("test");
        String actualValue = comment.getData();
        String expectedValue = "test";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("test");
        comment.setData("test2");
        String actualValue = comment.getData();
        String expectedValue = "test2";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testToString() throws IOException {
        Comment comment = new Comment("test");
        String actualValue = comment.toString();
        String expectedValue = "<!--test-->";
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testClone() {
        Comment comment = new Comment("test");
        Comment actualValue = comment.clone();
        Comment expectedValue = comment;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("test");
        boolean actualValue = comment.isXmlDeclaration();
        boolean expectedValue = false;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("test");
        XmlDeclaration actualValue = comment.asXmlDeclaration();
        assertEquals(null, actualValue);
    }

}