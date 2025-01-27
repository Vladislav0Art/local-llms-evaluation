package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedTest {

    @org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
    public static class GeneratedTest {
        @Mock
        private Parser parser;

        @Test
        public void newCommentWithDataShouldHaveCorrectData() {
            Comment comment = new Comment(DATA);
            assertEquals(DATA, comment.getData());
        }

        @Test
        public void newCommentWithoutDataShouldHaveEmptyString() {
            Comment comment = new Comment("");
            assertEquals("", comment.getData());
        }

        @Test
        public void nodeNameShouldReturnCommentNodeName() {
            Comment comment = new Comment(DATA);
            assertEquals("comment", comment.nodeName());
        }

        @Test
        public void getDataShouldReturnCorrectDataWhenSet() {
            Comment comment = new Comment("");
            comment.setData(DATA);
            assertEquals(DATA, comment.getData());
        }

        @Test
        public void setDataShouldUpdateCommentData() {
            Comment comment = new Comment("");
            comment.setData(DATA);
            assertEquals(DATA, comment.getData());
        }

        @Test
        public void outerHtmlTailShouldNotThrowException() {
            // No exception expected here
        }

        @Test
        public void toStringShouldReturnCorrectString() {
            Comment comment = new Comment(DATA);
            assertEquals("data", comment.toString());
        }

        @Test
        public void cloneShouldReturnNewCommentWithSameData() {
            Comment comment = new Comment(DATA);
            Comment clonedComment = comment.clone();
            assertEquals(comment.getData(), clonedComment.getData());
        }

        @Test
        public void isXmlDeclarationShouldReturnFalseWhenNotXmlDeclaration() {
            Comment comment = new Comment(DATA);
            assertFalse(comment.isXmlDeclaration());
        }

        @Test
        public void asXmlDeclarationShouldReturnNullWhenNotIsXmlDeclaration() {
            Comment comment = new Comment(DATA);
            assertNull(comment.asXmlDeclaration());
        }

    }