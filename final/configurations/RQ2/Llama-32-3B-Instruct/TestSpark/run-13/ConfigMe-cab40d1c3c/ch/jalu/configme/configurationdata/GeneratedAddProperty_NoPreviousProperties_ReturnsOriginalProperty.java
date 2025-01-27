package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GeneratedAddProperty_NoPreviousProperties_ReturnsOriginalProperty {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_NoPreviousProperties_ReturnsOriginalProperty() {
        Property<?> property = PropertiesHelper.getProperty();
        propertyListBuilder.add(property);
        Mockito.when(propertyListBuilder.getRootEntries()).thenReturn(Mockito.mock(Map.class, e -> (Map<String, Object>) e.getOrDefault("properties", new LinkedHashMap<>()))).get("properties");
        List<Property<?>> properties = new ArrayList<>();
        assertThat(properties, is(new ArrayList<>() {
            public void add(Property<?> p) {
                super.add(p);
            }
        }));
    }

    private static class PropertiesHelper {

        public static List<Property<?>> getProperties() {
            return new ArrayList<>();
        }

        public static void addProperty(List<Property<?>> properties) {
            PropertiesHelper.getProperties().add(new Property<>());
        }

        public static Property<?> getProperty() {
            return new Property();
        }
    }

}