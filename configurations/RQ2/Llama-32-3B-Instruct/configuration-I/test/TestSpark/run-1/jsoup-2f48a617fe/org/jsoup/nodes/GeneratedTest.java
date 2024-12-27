package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private int depth;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void newNodeTest() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
        assertEquals("data", comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        String newData = "newData";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        // No assertions as the implementation is not visible
    }

    @Test
    public void outerHtmlTailTest() {
        // No assertions as the implementation is not visible
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        String expected = "<!-- data -->";
        assertEquals(expected, comment.toString());
    }

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertEquals("<!-- data -->", xmlDeclaration.toString());
    }
}

public class DocumentOutputSettings {
    private static final String OUTPUT_SETTINGS = "output settings";
}

public class OutputSettings {
}

public class AppendableImpl implements Appendable {
    @Override
    public void append(CharSequence cs) {
    }
}

public interface Document {
    OutputSettings outputSettings();
}

public class OutputSettingsImpl implements OutputSettings {

    @Override
    public String toString() {
        return "";
    }
}

public class XmlDeclarationImpl implements XmlDeclaration {
    private final String data;

    public XmlDeclarationImpl(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }

}