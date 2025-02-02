package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAsXmlDeclaration_GivenHtmlFragment_ReturnsXmlDeclaration {

    public static class Appendable extends StringBuilder {
    }

    @Test
    public void asXmlDeclaration_GivenHtmlFragment_ReturnsXmlDeclaration() throws IOException {
        Appendable appendable = new Appendable();
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);

        String data = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\">";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }
}

class Document {
    public static class OutputSettings {
    }

    public interface Appendable extends StringBuilder {
    }

    public static class Element {
        public String tag() {
            return "";
        }

        public boolean formatAsBlock() {
            return false;
        }
    }

}