package ch.jalu.configme.configurationdata;

public class GeneratedTestEmptyString {

    @Test
    public void testEmptyString() {
        Property prop = new Property("name", "");
        assert prop.getValue().isEmpty();
    }
}

class Property {
    private String name;
    private String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return name.equals(property.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}