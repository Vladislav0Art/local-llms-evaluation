package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private String data;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void newCommentShouldBeInitializedWithGivenData() {
        new Comment(data);
        Mockito.verify(data).equals(Mockito.anyString());
    }

    @Test
    public void nodeNameShouldReturnExpectedValue() {
        Comment comment = new Comment(data);
        comment.nodeName();
        Mockito.verify(comment).nodeName();
    }

    @Test
    public void getDataShouldReturnGivenData() {
        String expectedData = "data";
        Comment comment = new Comment(expectedData);
        String actualData = comment.getData();
        Mockito.when(comment.data).thenReturn(expectedData);
        assertEquals(expectedData, actualData);
    }

    @Test
    public void setDataShouldSetNewDataForComment() {
        Comment comment = new Comment(data);
        comment.setData("newData");
        Mockito.verify(comment.data).equals("newData");
    }

    @Test
    public void outerHtmlHeadShouldNotThrowAnyExceptions() throws IOException {
        Comment comment = new Comment(data);
        appendableMock();
        documentOutputSettingsMock();
        documentBuilderMock();
        String expectedOutput = "expected html";
        Mockito.when(accum.append(Mockito.anyString())).thenReturn(expectedOutput);
        comment.outerHtmlHead(accum, 1, out);
        assertNotEquals("", expectedOutput);
    }

    @Test
    public void outerHtmlTailShouldNotThrowAnyExceptions() throws IOException {
        Comment comment = new Comment(data);
        appendableMock();
        documentOutputSettingsMock();
        String expectedOutput = "expected html";
        Mockito.when(accum.append(Mockito.anyString())).thenReturn(expectedOutput);
        comment.outerHtmlHead(accum, 1, out);
        comment.outerHtmlTail(accum, 2, out);
    }

    @Test
    public void toStringShouldReturnExpectedString() {
        Comment comment = new Comment(data);
        String expectedString = "expected string";
        Mockito.when(comment.data).thenReturn(expectedString);
        assertEquals(expectedString, comment.toString());
    }

    @Test
    public void cloneShouldReturnNewCommentObject() {
        Comment comment = new Comment(data);
        Comment clone = comment.clone();
        Mockito.verify(comment).clone();
        assertNotSame(comment, clone);
    }

    @Test
    public void isXmlDeclarationShouldReturnFalse() {
        Comment comment = new Comment(data);
        assertTrue(!comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationShouldReturnExpectedObject() {
        XmlDeclaration expectedDeclaration = mock(XmlDeclaration.class);
        Mockito.when(comment.data).thenReturn("data");
        Comment comment = new Comment("data");
        Comment actualDeclaration = comment.asXmlDeclaration();
        assertEquals(expectedDeclaration, actualDeclaration);
    }

    @Test
    public void isXmlDeclarationWhenDataEqualsExpectedShouldReturnTrue() {
        XmlDeclaration expectedDeclaration = mock(XmlDeclaration.class);
        Mockito.when(comment.data).thenReturn("expected data");
        Comment comment = new Comment("expected data");
        assertTrue(comment.isXmlDeclaration());
    }
}

class Document {
    OutputSettings out;

    public void documentBuilderMock() throws IOException {
    }
}

class Appendable implements Appendable {
    @Override
    public void append(String content) {
    }

    public void appendableMock() {
    }

    @Override
    public String toString() {
        return "";
    }
}

class XmlDeclaration {
    // no implementation needed

    public static class mock extends XmlDeclaration {
    }

}