package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone_GivenTextNode_ReturnsNewTextNode {

    public static class DocumentHelper {
        @Mock
        private LeafNode parentNode;

        @Mock
        private Appendable appendable;

        @Mock
        private int depth;

        @Mock
        private String siblingIndex();

        @Mock
        private Node sibling();

        @Mock
        private String text() throws Exception;

        public void addChildren(int index, Object child) {
            // mock implementation
        }

        public Appendable outerHtmlHead(Appendable appendable, int depth, Document document) {
            // mock implementation
            return null;
        }

        public String toString() {
            // mock implementation
            return "";
        }

        public Object clone() {
            // mock implementation
            return null;
        }
    }

    @RunWith(MockitoJUnitRunner.class)
    public class TextNodeTest {

        private DocumentHelper documentHelper;

        @BeforeEach
        public void setup() {
            documentHelper = new DocumentHelper();
        }

        @Test
        public void clone_GivenTextNode_ReturnsNewTextNode() {
            TextNode textNode = new TextNode("Hello World");
            Object result = documentHelper.documentHelper.clone();
            assertNotNull(result);
            assertEquals(textNode.text(), ((TextNode) result).text());
        }
    }

}