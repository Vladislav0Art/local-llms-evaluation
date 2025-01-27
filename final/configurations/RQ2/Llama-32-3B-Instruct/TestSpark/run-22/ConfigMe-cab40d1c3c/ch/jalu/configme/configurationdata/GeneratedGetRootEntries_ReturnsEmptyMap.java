package ch.jalu.configme.configurationdata;

public class GeneratedGetRootEntries_ReturnsEmptyMap {

    private String name;
    private String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    // getters and setters...

}

public class PropertyListBuilderTest {

    @Test
    public void getRootEntries_ReturnsEmptyMap() {
        Map<String, Object> entries = new PropertyListBuilder().getRootEntries();
        assertTrue(entries.isEmpty());
    }

}