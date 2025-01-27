package ch.jalu.configme.configurationdata;

public class GeneratedAddProperty_NullProperty_ThrowsConfigMeException {

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
    public void addProperty_NullProperty_ThrowsConfigMeException() {
        assertThrows(ConfigMeException.class, () -> new PropertyListBuilder().add(null));
    }

}