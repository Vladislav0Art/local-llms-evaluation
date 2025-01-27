package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class GeneratedTestAssertEquals {

    @Test
    public void testAssertEquals() {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("line1");
        lines.add("line2");
        lines.add("line3");

        String expectedConfig1 = "{\"path1\":\"line1\",\"path2\":\"line2\",\"path3\":\"line3\"}";
        String actualConfig1 = generateConfig();
        assertTrue(!actualConfig1.equals(expectedConfig1));

        ArrayList<String> paths = new ArrayList<>();
        paths.add("path1");
        paths.add("path2");
        paths.add("path3");

        StringBuilder configStr = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            configStr.append("\"").append(paths.get(i)).append("\":\"").append(lines.get(i)).append("\",");
        }
        configStr.deleteCharAt(configStr.length() - 1);

        String expectedConfig2 = "{";
        String actualConfig2 = generateConfig();
        assertEquals(expectedConfig2, actualConfig2);

        ArrayList<String> lines2 = new ArrayList<>();
        lines2.add("line4");
        lines2.add("line5");

        String expectedConfig3 = "{\"path1\":\"line4\",\"path2\":\"line5\"}";
        String actualConfig3 = generateConfig();
        assertEquals(expectedConfig3, actualConfig3);
    }

}