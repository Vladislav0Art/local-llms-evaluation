package ch.jalu.configme.configurationdata;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generated[addProperty][Scenario]

Test {

    private Map<String, Object> rootEntries = new HashMap<>();

    public void addProperty (Property < ? > property){
        rootEntries.put(property.getKey(), property.getValue());
    }

    public @NotNull List<Property<?>> create () {
        return new ArrayList<>(rootEntries);
    }

    protected final @NotNull Map<String, Object> getRootEntries () {
        return rootEntries;
    }
}

public class PropertyListBuilderTest {

    @Test
    public void [addProperty][Scenario]

    Test() {
        // Arrange
        Property<?> property = Mockito.mock(Property.class);

        // Act and Assert
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> list = builder.addProperty(property);
        Mockito.verify(builder, Mockito.times(1)).addProperty(Mockito.any(Property.class));

        // Verify
        Mockito.verifyNoMoreInteractions(list);
    }

}