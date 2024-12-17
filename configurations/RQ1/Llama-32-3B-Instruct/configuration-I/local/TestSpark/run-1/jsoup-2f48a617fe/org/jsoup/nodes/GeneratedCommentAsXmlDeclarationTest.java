package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCommentAsXmlDeclarationTest {

    @Test
    public void CommentAsXmlDeclarationTest() {
        Comment comment1 = new Comment("");
        assertNull(comment1.asXmlDeclaration());

        Comment comment2 = new Comment("This is not an XML Declaration");
        assertNull(comment2.asXmlDeclaration());

        Comment comment3 = new Comment("!XML Declaration");
        assertNotNull(comment3.asXmlDeclaration());
    }
}

class Document {
    public class OutputSettings {
        private boolean prettyPrint;

        public void setPrettyPrint(boolean prettyPrint) {
            this.prettyPrint = prettyPrint;
        }

        public boolean isPrettyPrint() {
            return prettyPrint;
        }
    }
}

class Accumulator implements Appendable {
    ByteArrayOutputStream output;

    public Accumulator(ByteArrayOutputStream out) {
        this.output = out;
    }

    @Override
    public String toString() {
        return output.toString();
    }

    @Override
    public void append(CharSequence csq, int start, int end) {
        output.append(csq);
    }
}

}