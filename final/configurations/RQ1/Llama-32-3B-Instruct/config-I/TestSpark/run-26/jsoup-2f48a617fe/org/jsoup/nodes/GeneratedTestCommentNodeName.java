package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedTestCommentNodeName {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public static class Comment {

        private String data;

        public Comment(String data) {
            this.data = data;
        }

        public String nodeName() {
            return "#comment";
        }

        public Comment coreValue(String data) {
            this.data = data;
            return this;
        }

        public void outerHtmlHead(Appendable accum, int count, Document.OutputSettings out) {
        }

        public void outerHtmlTail(Appendable accum, int count, Document.OutputSettings out) {
        }

        public String outerHtml() {
            return "<!--" + data + "-->";
        }

        public Comment clone() {
            return new Comment(data);
        }
    }

    @Before
    public void setUp() {
        when(accum.toString()).thenReturn("");
        when(out.toString()).thenReturn("");
    }

    @Test
    public void testCommentNodeName() {
        Comment comment = new Comment("");
        org.junit.Assert.assertEquals(comment.nodeName(), "#comment");
    }

}