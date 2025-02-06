package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LeafNode leafNodeMock;

    @InjectMocks
    private Comment commentObject;

    @Test
    public void constructorHasCorrectParameters() {
        assertEquals(leafNodeMock, commentObject);
    }

    @Test
    public void nodeNameReturnsNodeName() {
        when(leafNodeMock.nodeName()).thenReturn("comment");
        assertEquals("comment", commentObject.nodeName());
    }

    @Test
    public void getDataReturnsData() {
        when(leafNodeMock.getData()).thenReturn("data");
        assertEquals("data", commentObject.getData());
    }

    @Test
    public void setDataSetsCorrectData() {
        String expectedData = "newData";
        when(leafNodeMock.setData(anyString())).thenAnswer(e -> expectedData);
        commentObject.setData("data");
        assertEquals(expectedData, leafNodeMock.getData());
    }

    @Test
    public void outerHtmlHeadAccumulatesOuterHtml() throws IOException {
        when(leafNodeMock.outerHtmlHead(any(Appendable.class), anyInt(), any(Document.OutputSettings.class))).thenReturn("");
        String expectedOutput = "<!-- data -->";
        commentObject.outerHtmlHead(new StringBuilder(), 1, new Document.OutputSettings());
        assertEquals(expectedOutput, commentObject.toString().trim());
    }

    @Test
    public void outerHtmlTailAccumulatesOuterHtml() throws IOException {
        when(leafNodeMock.outerHtmlTail(any(Appendable.class), anyInt(), any(Document.OutputSettings.class))).thenReturn("");
        String expectedOutput = "</!-- data -->";
        commentObject.outerHtmlHead(new StringBuilder(), 1, new Document.OutputSettings());
        commentObject.outerHtmlTail(new StringBuilder(), 1, new Document.OutputSettings());
        assertEquals(expectedOutput, commentObject.toString().trim());
    }

    @Test
    public void toStringReturnsOuterHtml() {
        when(leafNodeMock.toString()).thenReturn("<!-- data -->");
        assertEquals("<!-- data -->", commentObject.toString());
    }

    @Test
    public void cloneCreatesCorrectClone() {
        Comment cloned = commentObject.clone();
        assertEquals(commentObject, cloned);
    }

    @Test
    public void isXmlDeclarationReturnsFalse() {
        when(leafNodeMock.isXmlDeclaration()).thenReturn(false);
        boolean result = commentObject.isXmlDeclaration();
        assertFalse(result);
    }

    @Test
    public void asXmlDeclarationRetainsCorrectData() {
        when(leafNodeMock.asXmlDeclaration()).thenReturn("<!-- data -->");
        XmlDeclaration expectedResult = new XmlDeclaration("data", "comment");
        assertEquals(expectedResult, commentObject.asXmlDeclaration());
    }

}