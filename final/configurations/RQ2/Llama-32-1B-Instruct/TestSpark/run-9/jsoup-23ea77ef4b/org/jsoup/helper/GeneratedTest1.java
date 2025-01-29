package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest1 {

    @Test
    public void test1() {
        W3CDom dom = new W3CDom();
        assertEquals("<html><body>Hello World!</body></html>", dom.asString("html", "body"));
    }

}