package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetPopStackFromStack_4 {

    @Test
    public void testGetPopStackFromStack_4() {
        String startTag = "<child>";
        Object[] stack = new Object[]{(String[]) ((Object) stack)[0]};
        Main.getPopStackFromStack("", "", "");
        assert stack.length == 1;
        assert stack[0].equals("");
    }

}