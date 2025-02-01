package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetChildMapObjectNotFoundTest {

    @Test
    public void getChildMapObjectNotFoundTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = builder.getRootEntries();
        PropertyListBuilder.getChildMap(map, "missingKey");
    }

}