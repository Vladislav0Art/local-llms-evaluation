package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestPopStackToClose_3 {

    @Test
    public void testPopStackToClose_3() {
        String startTag = "<child>";
        Object[] stack = new Object[1];
        ((Object) stack)[0] = "start";
        Main.popStackToClose(startTag, "");
        assert stack[0].equals("");
    }

}