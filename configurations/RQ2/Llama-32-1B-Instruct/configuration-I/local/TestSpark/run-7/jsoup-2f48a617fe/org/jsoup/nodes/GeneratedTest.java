package org.jsoup.nodes;

public class GeneratedTest {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    @Override
    public String nodeName() {
        return "Comment";
    }
}

public class XmlDeclaration extends Comment {

    private String type;

    public XmlDeclaration(String data, String type) {
        super(data);
        this.type = type;
    }

    @Nullable
    public XmlDeclaration asXmlDeclaration() {
        if (this.type.equals("xml")) {
            return this;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    @Nullable
    public String toString() {
        StringBuilder builder = new StringBuilder("<Comment");
        builder.append(": ").append(this.data);
        if (!this.type.equals("xml")) {
            builder.append("</Comment>");
        }
        return builder.toString();
    }
}

public class CommentTest {

}