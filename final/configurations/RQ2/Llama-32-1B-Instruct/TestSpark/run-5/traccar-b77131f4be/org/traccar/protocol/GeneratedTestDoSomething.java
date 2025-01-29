package org.traccar.protocol;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestDoSomething {

    public String decode(byte[] data) throws Exception {
        return Main.class.getName() + ": " + Arrays.deepToString(data);
    }

    @Test
    public void testDoSomething() {
        doSomething("example");
        fail("Expected RuntimeException");
    }

    private void doSomething(String msg) {
        System.out.println(msg);
    }

}