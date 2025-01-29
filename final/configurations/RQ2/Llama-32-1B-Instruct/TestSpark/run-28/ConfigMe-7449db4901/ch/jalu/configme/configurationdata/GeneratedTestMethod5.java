package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

public class GeneratedTestMethod5 {

    @Test
    public void testMethod5() {
        public String getFirstChar (String str){
            if (str != null && !str.isEmpty()) {
                return str.charAt(0);
            } else {
                return null;
            }
        }

        String str = "Hello";
        System.out.println(getFirstChar(str));
    }

}