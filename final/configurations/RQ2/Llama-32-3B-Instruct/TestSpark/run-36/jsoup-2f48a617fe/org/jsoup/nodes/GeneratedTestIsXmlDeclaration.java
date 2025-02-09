package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestIsXmlDeclaration {

    @Mock
    private Appendable accum;

    public static class Comment {
        public String data;

        public String nodeName() {
            return "data";
        }

        public void setData(String data) {
            this.data = data;
        }

        public String toString() {
            return "<!--" + data + "-->";
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment();
        MockedOutputSettings outputSettings = new MockedOutputSettings();
        outputSettings.isXmlDeclaration().returns(false);
        Comment out = new Comment();
        out.setOut(outputSettings);
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}