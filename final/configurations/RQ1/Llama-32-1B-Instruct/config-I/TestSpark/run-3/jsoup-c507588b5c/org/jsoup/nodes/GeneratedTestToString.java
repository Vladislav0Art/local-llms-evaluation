package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.List;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        Test node = new Test();
        assert node.toString().equals("p Hello World");
    }
}

class Document {
    private Appendable accum;

    public Appendable getAccum() {
        return accum;
    }

    public void setAccum(Appendable accum) {
        this.accum = accum;
    }
}

class Appender extends Appendable {
    private Document document;
    private int index;

    public Appender(Document document, Appendable accum, int index) {
        this.document = document;
        this.index = index;
    }

    @Override
    public void append(char c) {
        if (index < document.getAccum().length()) {
            document.setAccum(document.getAccum() + String.valueOf(c));
        } else {
            super.append(c);
        }
    }
}

class DocumentAppender extends Appender {

    public DocumentAppender(Document document, Appendable accum, int index) {
        super(document, accum, index);
    }

    @Override
    public void append(char c) {
        if (index < document.getAccum().length()) {
            document.setAccum(document.getAccum() + String.valueOf(c));
        } else {
            super.append(c);
        }
    }
}

class Test extends Document {
    private int index;

    @Override
    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public Appendable getAccum() {
        return this.accum;
    }

    @Override
    public int getIndex() {
        return index;
    }

}