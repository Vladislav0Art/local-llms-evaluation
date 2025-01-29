package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetPopStackFromStack_14 {

    @Test
    public void testGetPopStackFromStack_14() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("", "", "start");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

}