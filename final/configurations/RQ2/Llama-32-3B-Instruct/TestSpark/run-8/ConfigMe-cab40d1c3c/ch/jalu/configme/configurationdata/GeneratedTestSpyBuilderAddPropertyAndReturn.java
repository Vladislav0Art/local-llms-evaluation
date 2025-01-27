package ch.jalu.configme.configurationdata;

public class GeneratedTestSpyBuilderAddPropertyAndReturn {

    public static <T> List<T> emptyList() {
        return new ArrayList<>();
    }

    public static <T> void add(List<T> list, T element) {
        list.add(element);
    }
}

public class Property {
    private String key;
    private String value;

    public Property(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Property{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

public class SpyBuilder {
    private List<Property> properties = new ArrayList<>();

    public void addProperty(String key, String value) {
        this.properties.add(new Property(key, value));
    }

    public List<Property> getProperties() {
        return properties;
    }
}

public class TestPropertyListBuilder {

    @Test
    public void testSpyBuilderAddPropertyAndReturn() {
        SpyBuilder spyBuilder = new SpyBuilder();
        spyBuilder.addProperty("property1", "value1");
        List<Property> expectedProperties = List.emptyList();
        Mockito.when(spyBuilder.addProperty("property2", "value2")).thenReturn(expectedProperties);
        assertEquals(0, spyBuilder.addProperty("property2", "value2").size());
    }

}