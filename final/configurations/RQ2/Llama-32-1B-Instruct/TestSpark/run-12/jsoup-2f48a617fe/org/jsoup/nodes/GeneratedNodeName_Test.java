package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedNodeName_Test {

    private static Comment comment;

    @FunctionalInterface
    public interface Appendable {
        void append(String data);
    }

    @Before
    public void setup() {
        ParseSettings parseSettings = new ParseSettings();
        comment = new Comment("This is a test comment");
        appendableMocker = Mockito.mock(Appendable.class, "append");
        parserMocker = Mockito.mock(Parser.class, "parse");
        outputSettingsMock = Mockito.mock(Document.OutputSettings.class, "outputSettings");
    }

    @Test
    public void nodeName_Test() {
        String expected = "Comment";
        assertEquals(expected, comment.nodeName());
    }

}