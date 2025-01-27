package ch.jalu.configme.configurationdata;

public class GeneratedCreate_EmptyList_ReturnsEmptyList {

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
    public void create_EmptyList_ReturnsEmptyList() {
        List<Property> properties = new ArrayList<>();
        List<Property> result = new PropertyListBuilder().create(properties);
        assertTrue(result.isEmpty());
    }

}