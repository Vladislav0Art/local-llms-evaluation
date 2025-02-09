package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestToString {

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
    public void testToString() {
        Comment comment = new Comment();
        String expectedOutput = "<!--data-->";
        Assert.assertEquals(expectedOutput, comment.toString());
    }
}

public class MockedOutputSettings {
    private boolean isXmlDeclarationReturns;

    public boolean isXmlDeclarationReturns() {
        return isXmlDeclarationReturns;
    }

    public void setIsXmlDeclarationReturns(boolean isXmlDeclarationReturns) {
        this.isXmlDeclarationReturns = isXmlDeclarationReturns;
    }

    public Object isXmlDeclaration() {
        return isXmlDeclarationReturns;
    }

}