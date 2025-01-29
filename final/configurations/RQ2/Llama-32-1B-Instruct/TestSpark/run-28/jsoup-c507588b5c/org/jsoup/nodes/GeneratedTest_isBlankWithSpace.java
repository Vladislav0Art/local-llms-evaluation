package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest_isBlankWithSpace {

    @Test
    public void test_isBlankWithSpace() {
        String html = "<p>This is a  <span>test</span> paragraph.</p>";
        System.out.println(Main.isBlank(html));
    }

}