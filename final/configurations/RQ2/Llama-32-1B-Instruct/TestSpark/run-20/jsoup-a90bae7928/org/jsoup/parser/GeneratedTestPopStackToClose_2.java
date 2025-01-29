package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestPopStackToClose_2 {

    @Test
    public void testPopStackToClose_2() {
        String startTag = "<child>";
        Object[] stack = new Object[1];
        ((Object) stack)[0] = "start";
        Main.popStackToClose(startTag, "end");
        assert stack[0].equals("end");
    }

}