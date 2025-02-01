package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetChildMapUnknownTypeTest {

    @Test
    public void getChildMapUnknownTypeTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = builder.getRootEntries();
        // Add unexpected object type in map
        map.put("weirdKey", new Object());
        PropertyListBuilder.getChildMap(map, "weirdKey");
    }

}