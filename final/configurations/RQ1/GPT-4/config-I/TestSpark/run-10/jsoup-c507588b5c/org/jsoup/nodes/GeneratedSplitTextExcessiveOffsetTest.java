package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSplitTextExcessiveOffsetTest {

    @Test
    public void splitTextExcessiveOffsetTest() {
        new TextNode("SplitMe").splitText(100);
    }

}