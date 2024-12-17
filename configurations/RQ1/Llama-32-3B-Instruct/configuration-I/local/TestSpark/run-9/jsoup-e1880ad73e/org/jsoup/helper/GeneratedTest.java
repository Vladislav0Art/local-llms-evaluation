package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    public static class MockUrlBuilder extends UrlBuilder {
        @Override
        public void appendKeyVal(Connection.KeyVal kv) throws UnsupportedEncodingException {
            // just return the StringBuilder, mock it later in a method call
            q.append(kv.getKey() + "=" + kv.getValue());
        }

        @Override
        public void appendToAscii(String str, boolean encode, StringBuilder sb) {
            if (encode) {
                for (char c : str.toCharArray()) {
                    char asciiVal = (char) c;
                    if (asciiVal >= 32 && asciiVal = 126) {
                        sb.append('%');
                        String hex = Integer.toHexString(asciiVal);
                        while (hex.length() == 1)
                            hex = "0" + hex;
                        sb.append(hex.toLowerCase());
                    } else
                        sb.append(c);
                }
            } else {
                sb.append(str);
            }
        }

        public StringBuilder getQ() {
            return q;
        }

        private StringBuilder q = new StringBuilder();
    }

}