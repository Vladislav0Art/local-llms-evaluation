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
public class GeneratedAsXmlDeclarationTest {

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