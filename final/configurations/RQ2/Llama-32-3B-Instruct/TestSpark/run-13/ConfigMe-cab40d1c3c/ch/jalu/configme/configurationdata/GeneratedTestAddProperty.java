package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty {

}

public class PropertiesHelper {
    private static List<Property> properties = new ArrayList<>();

    public static void add(Property p) {
        properties.add(p);
    }

    public static List<Property> getProperties() {
        return properties;
    }

    public static Property getProperty() {
        return null; // Return null instead of creating a new instance
    }
}

public class GeneratedTest {

    private PropertiesHelper properties;

    @BeforeAll
    public void setup() {
        this.properties = new PropertiesHelper();
    }

    @AfterAll
    public void tearDown() {
        properties = null;
    }

    @Test
    public void testAddProperty() {
        Property p = new Property();
        this.properties.add(p);
    }

}