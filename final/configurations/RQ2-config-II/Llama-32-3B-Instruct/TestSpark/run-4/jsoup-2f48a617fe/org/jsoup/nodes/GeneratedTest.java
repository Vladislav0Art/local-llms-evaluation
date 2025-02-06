package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Parser parser;

    @Test
    public void constructor_withData_returnsComment() {
        String data = "data";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeName_isData() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getData_setsCorrectValue() {
        String expectedData = "expectedData";
        Comment comment = new Comment(expectedData);
        assertEquals(expectedData, comment.getData());
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHead_usesParser_forComment() throws IOException {
        when(parser.parseString(anyString(), any())).thenReturn(this.accum);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 1, out);
        assertTrue(accum.toString().contains("<!-- data -->"));
    }

    @Test
    public void outerHtmlTail_appendsCommentToAccum() throws IOException {
        when(parser.parseString(anyString(), any())).thenReturn(this.accum);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 1, out);
        assertEquals("\n<!-- data -->\n", accum.toString());
    }

    @Test
    public void toString_returnsData() {
        String expectedData = "expectedData";
        Comment comment = new Comment(expectedData);
        assertEquals(expectedData, comment.toString());
    }

    @Test
    public void clone_returnsSameComment() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertTrue(comment == cloned);
    }

    @Test
    public void isXmlDeclaration_returnsFalse() {
        Comment comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_returnsNull() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}