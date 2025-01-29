package org.jsoup.safety;

import org.junit.Test;

public class GeneratedTestGetPre {

    @Test
    public void testGetPre() {
        String element = "span";

        // Test case 1: get pre element of an element with no parent
        PreElement pre = Element.getPre(element);
        if (pre != null) {
            System.out.println("Pre: " + pre.getName());
        } else {
            System.out.println("No pre");
        }

        // Test case 2: get pre element of an element without a parent
        pre = Element.getPre(null, true);
        if (pre == null) {
            System.out.println("No pre");
        } else {
            System.out.println("Pre: " + pre.getName());
        }
    }

}