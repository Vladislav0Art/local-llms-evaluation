package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private String name;
    private String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property)) return false;
        Property property = (Property) o;
        return Objects.equals(name, property.name) && Objects.equals(value, property.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}

public class PropertyListBuilder {

    private List<Property> properties;

    public void add(Property property) {
        properties.add(property);
    }

    public void clear() {
        properties.clear();
    }

    public List<Property> create() {
        return new ArrayList<>(properties); // Return a copy to prevent external modification
    }
}

public class PropertyListBuilderTest {

}