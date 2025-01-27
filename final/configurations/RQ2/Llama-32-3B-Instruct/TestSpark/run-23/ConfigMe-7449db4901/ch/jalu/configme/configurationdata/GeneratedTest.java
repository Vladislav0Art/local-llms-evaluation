package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void testGenerateConfig() {
        String expectedConfig = "{\"path1\":\"line1\",\"path2\":\"line2\",\"path3\":\"line3\"}";
        String actualConfig = generateConfig();
        assertEquals(expectedConfig, actualConfig);
    }

    public String generateConfig() {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("line1");
        lines.add("line2");
        lines.add("line3");

        ArrayList<String> paths = new ArrayList<>();
        paths.add("path1");
        paths.add("path2");
        paths.add("path3");

        StringBuilder configStr = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            configStr.append("\"").append(paths.get(i)).append("\":\"").append(lines.get(i)).append("\",");
        }
        configStr.deleteCharAt(configStr.length() - 1);

        return configStr.toString();
    }

}