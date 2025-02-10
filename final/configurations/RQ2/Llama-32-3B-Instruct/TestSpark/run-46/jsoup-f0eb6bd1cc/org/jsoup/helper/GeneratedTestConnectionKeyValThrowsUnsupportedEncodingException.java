package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestConnectionKeyValThrowsUnsupportedEncodingException {

    @Test
    public void testConnectionKeyValThrowsUnsupportedEncodingException() {
        try {
            String param1 = "param1";
            String value1 = "value with invalid encoding";
            Connection.KeyVal kv = Connection.KeyVal.of(param1, value1);
            System.out.println(kv);
        } catch (java.net.UnsupportedSocketException e) {
            System.out.println("UnsupportedEncodingException");
        }
    }

}