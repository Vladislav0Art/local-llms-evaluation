package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

public class GeneratedTestIsXmlDeclaration {

    private String nodeName() {
        return "#comment";
    }

    @Override
    public String nodeName() {
        return nodeName();
    }

    public boolean isXmlDeclaration() {
        return isXmlDeclaration();
    }

    public XmlDeclaration asXmlDeclaration(Map<String, Object> attributes) {
        return (XmlDeclaration) super.asXmlDeclaration(attributes);
    }

    public Comment setData(String data) {
        coreValue(data);
        return this;
    }
}

public class CommentTest {

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("!" + "XML Declaration");
        assertTrue(comment.isXmlDeclaration());
    }

}