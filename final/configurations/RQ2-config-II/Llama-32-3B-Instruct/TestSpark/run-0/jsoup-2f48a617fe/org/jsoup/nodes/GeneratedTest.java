package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void newNode_withEmptyData_isNotNull() {
        Comment comment = new Comment("");
        assertThat(comment, notNullValue());
    }

    @Test
    public void nodeName_returnsCorrectName() {
        Comment comment = new Comment("data");
        assertThat(comment.nodeName(), is("COMMENT"));
    }

    @Test
    public void getData_returnsCorrectData() {
        String data = "data";
        Comment comment = new Comment(data);
        assertThat(comment.getData(), is(data));
    }

    @Test
    public void setData_setsCorrectData() {
        String data = "new data";
        Comment comment = new Comment("old data");
        comment.setData(data);
        assertThat(comment.getData(), is(data));
    }

    @Test
    public void outerHtmlHead_appendsToAccum() throws IOException {
        Appendable accum = mock(Appendable.class);
        Comment comment = new Comment("data");
        Document document = mock(Document.class);
        Parser parser = mock(Parser.class);

        when(parser.parse(document, comment, ParseSettings.DEFAULT)).thenReturn(document);
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        verify(accum).append(anyString());
    }

    @Test
    public void outerHtmlTail_appendsToAccum() throws IOException {
        Appendable accum = mock(Appendable.class);
        Comment comment = new Comment("data");
        Document document = mock(Document.class);
        Parser parser = mock(Parser.class);

        when(parser.parse(document, comment, ParseSettings.DEFAULT)).thenReturn(document);
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        verify(accum).append(anyString());
    }

    @Test
    public void clone_returnsNewComment() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertThat(cloned, not(nullValue()));
        assertThat(cloned.getData(), is(comment.getData()));
    }

    @Test
    public void isXmlDeclaration_returnsFalse() {
        Comment comment = new Comment("data");
        assertThat(comment.isXmlDeclaration(), is(false));
    }

    @Test
    public void asXmlDeclaration_returnsNull() {
        Comment comment = new Comment("data");
        assertThat(comment.asXmlDeclaration(), nullValue());
    }

}