package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclaration_throwsIOException_onParseError {

    private Appendable accum = new StringBuilder();

    @Test
    public void asXmlDeclaration_throwsIOException_onParseError() throws IOException {
        doThrow(new IOException()).when(Parser.htmlParser())
                .settings(ParseSettings.preserveCase)
                .parseInput(any(), any());
        Comment(comment, accum);
        assertNull(asXmlDeclaration());
    }
}

class Document {
}

class Parser {

    public static Parser htmlParser() {
        return new Parser();
    }

    class Settings {
    }

    class ParseSettings extends Settings {
    }

    class ParseOptions {
    }

    class DocumentBuilder {
    }
}

class XmlDeclaration {

    private String tag;

    public XmlDeclaration(String tag) {
        this.tag = tag;
    }

}