package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTestPublicMethod {

    @Test
    public void testPublicMethod() {
        NetworkMessage networkMessage = new NetworkMessage(1, "Hello", 1);
        System.out.println(networkMessage.toString());
        System.out.println("isPublic: " + networkMessage.isPublic());

        try {
            int _x = (int) networkMessage.getValue();
        } catch (Exception e) {
        }

    }

    public String getValue() {
        return value;
    }

}