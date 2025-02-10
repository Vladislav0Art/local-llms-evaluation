package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestConnectionKeyVal {

    @Test
    public void testConnectionKeyVal() {
        // Create KeyVal object manually as it's not available in JUnit
        String param1 = "param1";
        String value1 = "value1";
        String param2 = "newParam";
        String value2 = "newValue";

        class KeyVal {
            public static Connection.KeyVal of(String param, String value) {
                return new Connection.KeyVal(param, value);
            }
        }

        System.out.println(KeyVal.of(param1, value1));
        System.out.println(KeyVal.of(param2, value2));
    }

}