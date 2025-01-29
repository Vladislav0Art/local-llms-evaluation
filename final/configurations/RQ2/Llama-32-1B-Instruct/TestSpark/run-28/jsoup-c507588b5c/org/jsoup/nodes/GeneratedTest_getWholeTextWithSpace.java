package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest_getWholeTextWithSpace {

    @Test
    public void test_getWholeTextWithSpace() {
        String html = "This is a   <span>test</span> paragraph.";
        System.out.println(Main.getWholeText(html));
    }

}