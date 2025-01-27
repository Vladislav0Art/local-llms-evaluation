package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntries_ReturnsCorrectMap {

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