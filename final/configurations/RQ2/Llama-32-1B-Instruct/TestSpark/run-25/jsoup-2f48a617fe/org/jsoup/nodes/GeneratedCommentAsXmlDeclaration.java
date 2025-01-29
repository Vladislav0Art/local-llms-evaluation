package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedCommentAsXmlDeclaration {

    public static void main(String[] args) {
        TestSpark spark = new TestSpark();
        runTest(spark);
    }

    @Before
    public static void setup() throws Exception {
        ParseSettings settings = new ParseSettings();
        Parser parser = new Parser(settings);
        Document document = parser.parse("<comment>This is a test</comment>");
        comment = new Comment("This is a test");
        comment.setData(document.body().data());
    }

    @Test
    public void commentAsXmlDeclaration() {
        assertNotNull(comment.asXmlDeclaration());
    }
}

class TestSpark {

    public static class TestComment extends Comment {

        @Override
        public String nodeName() {
            return "comment";
        }

        @Override
        public String getData() {
            return null;
        }

        public void setData(String data) {
            innerData = data;
        }

        private String innerData;

        @Override
        public boolean isXmlDeclaration() {
            // Check if we are in the comment block for XML declaration
            return false; // This method should be overridden
        }

        @Nullable
        @Override
        public XmlDeclaration asXmlDeclaration() {
            // Return null because the comment does not have an XML declaration
            return null;
        }
    }

}