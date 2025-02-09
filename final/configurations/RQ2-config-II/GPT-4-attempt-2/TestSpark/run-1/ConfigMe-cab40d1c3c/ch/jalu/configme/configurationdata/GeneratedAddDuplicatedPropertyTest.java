package ch.jalu.configme.configurationdata;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;

public class GeneratedAddDuplicatedPropertyTest {

    @Test
    public void addDuplicatedPropertyTest() {
        // given
        Property<String> property = new StringProperty("config.key", "default");
        PropertyListBuilder builder = new PropertyListBuilder();

        // when
        builder.add(property);
        builder.add(property);

        // then creates exception
    }

}