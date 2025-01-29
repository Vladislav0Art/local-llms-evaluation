package com.force.i18n.grammar.impl;

import org.junit.Test;

import java.io.InputStream;

import static org.hamcrest.Matchers.is;

public class GeneratedTestWriteJson {

    @Test
    public void testWriteJson() throws Exception {
        InputStream inputStream = getClass().getResourceAsStream("/input.json");
        StringBuilder contentBuilder = new StringBuilder();
        int bytesRead;
        while ((bytesRead = inputStream.read(contentBuilder)) != -1) {
            System.out.println("Written: " + bytesRead);
            if (contentBuilder.length() > 0 && contentBuilder.charAt(0) == '\n') {
                System.out.println("Written: " + contentBuilder.toString());
                contentBuilder.setLength(0);
            } else {
                System.out.println("Written: " + bytesRead);
            }
        }
        inputStream.close();

        Map<String, Object> data = writeJson(inputStream, new HashMap<>());
        System.out.println(data);

        InputStream inputStream2 = getClass().getResourceAsStream("/output.json");
        StringBuilder contentBuilder2 = new StringBuilder();
        int bytesRead2;
        while ((bytesRead2 = inputStream2.read(contentBuilder2)) != -1) {
            if (contentBuilder2.length() > 0 && contentBuilder2.charAt(0) == '\n') {
                System.out.println("Written: " + contentBuilder2.toString());
                contentBuilder2.setLength(0);
            } else {
                System.out.println("Written: " + bytesRead2);
            }
        }
        inputStream2.close();

        Map<String, Object> data2 = writeJson(inputStream2, new HashMap<>());
        System.out.println(data2);

    }

    private Map<String, Object> writeJson(InputStream in, Map<String, Object> obj) throws Exception {
        StringBuilder sb = new StringBuilder();
        int bytesRead;
        while ((bytesRead = in.read(sb)) != -1) {
            if (sb.length() > 0 && sb.charAt(0) == '\n') {
                System.out.println("Written: " + sb.toString());
                sb.setLength(0);
            } else {
                sb.append(bytesRead).append("\n");
            }
        }

        return obj;
    }

}