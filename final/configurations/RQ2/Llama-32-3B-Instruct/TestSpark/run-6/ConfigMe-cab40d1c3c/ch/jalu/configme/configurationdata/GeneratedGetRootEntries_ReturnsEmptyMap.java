package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntries_ReturnsEmptyMap {

    @Mock
    private List<Property<?>> properties;

    @Test
    public void getRootEntries_ReturnsEmptyMap() {
        assertEquals(0, new PropertyListBuilder().getRootEntries().size());
    }
}

class PropertyListBuilder {
    private List<Property<?>> properties = new ArrayList<>();

    public void add(Property<?> property) {
        if (property.getKey() == null || property.getValue() == null) {
            throw new ConfigMeException("Property is invalid");
        }

        properties.add(property);
    }

    public List<Property<?>> create() {
        return properties;
    }

    protected final Map<String, Object> getRootEntries() {
        return Collections.emptyMap();
    }

}