package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void addProperty_NoAdditionalProperties_ReturnsEmptyList() {
        // given:
        PropertyListBuilder builder = new PropertyListBuilder();

        // when:
        List<Property<?>> properties = builder.addProperty(new Property<>("a", "b"));

        // then:
        assertEquals(1, properties.size());
    }

    @Test
    public void addProperty_AdditionalProperties_ReturnsCorrectlyFormedList() {
        // given:
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = new ArrayList<>();
        Property<?> p1 = new Property<>("a", "b");
        Property<?> p2 = new Property<>("c", "d");

        // when:
        Properties ps = builder.addProperties(p1, p2);

        // then:
        assertEquals(2, ps.size());
    }

    @Test
    public void addProperty_ThrowsConfigMeException() {
        // given:
        PropertyListBuilder builder = new PropertyListBuilder();

        // when and then:
        assertThrows(ConfigMeException.class, () -> builder.addProperty(null));
    }

    @Test
    public void createProperties_ReturnsEmptyList() {
        // given:
        PropertyListBuilder builder = new PropertyListBuilder();

        // when:
        List<Property<?>> properties = builder.createProperties();

        // then:
        assertTrue(properties.isEmpty());
    }

    @Test
    public void getRootEntries_ReturnsCorrectMap() {
        // given:
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> expectedRootEntries = new LinkedHashMap<>();
        expectedRootEntries.put("a", "b");

        // when:
        Properties properties = builder.getRootEntries();

        // then:
        assertEquals(expectedRootEntries, (Map) properties);
    }
}

public class PropertyListBuilder {
    private List<Property<?>> properties = new ArrayList<>();

    public Properties addProperties(Property<?> property1, Property<?> property2) {
        if (property1 == null || property2 == null) {
            throw new ConfigMeException("Property cannot be null");
        }
        return Collections.singletonList(property1);
    }

    public Properties createProperties() {
        return properties;
    }

    protected final Map<String, Object> getRootEntries() {
        return new LinkedHashMap<>();
    }

}