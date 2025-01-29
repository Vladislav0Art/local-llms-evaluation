package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest3 {

    public String getUserData(String key) {
        return "MyObject";
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "userData='" + getUserData("key") + '\'' +
                '}';
    }
}

@Test
public void test3() {
    MyObject myObject = new MyObject();
    Object value = getUserData("key");
    assertEquals(value, "MyObject");
}

}