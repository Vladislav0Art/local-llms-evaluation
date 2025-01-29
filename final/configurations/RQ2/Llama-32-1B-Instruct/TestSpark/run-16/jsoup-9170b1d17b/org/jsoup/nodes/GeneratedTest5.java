package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest5 {

    @Test
    public void test5() {
        MyObject myObject = new MyObject();
        Object value = myObject.getUserData("key");
        assert value instanceof String;
        assertEquals(value, "MyObject");
    }

    static class MyObject {
        private final Object userData;

        public MyObject(Object userData) {
            this.userData = userData;
        }

        @Override
        public String toString() {
            return "MyObject{" +
                    "userData=" + userData +
                    '}';
        }
    }

}