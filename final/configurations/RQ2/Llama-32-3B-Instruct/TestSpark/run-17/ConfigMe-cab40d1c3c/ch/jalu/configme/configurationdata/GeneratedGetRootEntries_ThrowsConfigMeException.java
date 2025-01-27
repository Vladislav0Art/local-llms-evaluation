package ch.jalu.configme.configurationdata;

public class GeneratedGetRootEntries_ThrowsConfigMeException {

    private String value;

    public Property(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return value.equals(property.value);
    }
}

public class ConfigMeException extends Exception {
}

class PropertyListBuilderTest {

    @Test
    public void getRootEntries_ThrowsConfigMeException() {
        assertThrows(ConfigMeException.class, () -> new PropertyListBuilder().getRootEntries());
    }

}