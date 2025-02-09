package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

public class GeneratedCreateFromEncodedWorksCorrectly {

    @Test
    public void createFromEncodedWorksCorrectly() {
        String encodedText = "&#65;&#66;&#67;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertThat(node.text(), is("abc"));
    }
}

public class Document {

    private String html;

    public void setText(String text) {
        this.html = text;
    }

    public String html() {
        return html;
    }
}

public class Appendable implements java.io.Writer {

}

public class mockAppendable implements Appendable {

    @Override
    public void write(char[] c, int i, int count) throws java.io.IOException {
    }
}

}