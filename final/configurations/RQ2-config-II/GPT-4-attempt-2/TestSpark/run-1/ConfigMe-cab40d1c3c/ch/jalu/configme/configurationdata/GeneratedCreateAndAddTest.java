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

public class GeneratedCreateAndAddTest {

    @Test
    public void createAndAddTest() {
        // given
        PropertyListBuilder builder = new PropertyListBuilder();

        // when
        List<Property<?>> emptyList = builder.create();
        builder.add(new StringProperty("config.key", "default"));

        // then
        assertEquals(0, emptyList.size());
        assertEquals(1, builder.create().size());
    }

}