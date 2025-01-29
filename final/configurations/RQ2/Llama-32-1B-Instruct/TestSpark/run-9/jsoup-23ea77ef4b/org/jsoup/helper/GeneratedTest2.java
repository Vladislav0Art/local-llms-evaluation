package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest2 {

    @Test
    public void test2() {
        Object[] args = {new W3CDom()};
        String result = Main.class.getClassLoader().loadClass("Main").getDeclaredMethod("test1", Object[].class).invoke(null, args);
        assertEquals("Hello World!", (String) result);
    }

}