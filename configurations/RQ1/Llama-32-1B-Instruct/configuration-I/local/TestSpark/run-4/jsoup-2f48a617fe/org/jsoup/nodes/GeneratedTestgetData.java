package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Text;

public class GeneratedTestgetData {

    public static String nodeName(String comment) {
        return comment.nodeName();
    }

    @Test
    public void testgetData() {
        Node node = new Tag("", 1);
        node.appendChild(new Text(""));
        assertEquals("This is a sample comment.", getData(node));
    }

    public static class Tag implements Comparable<Tag> {
        private String name;

        public Tag(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Tag other) {
            return this.name.compareTo(other.name);
        }
    }

}