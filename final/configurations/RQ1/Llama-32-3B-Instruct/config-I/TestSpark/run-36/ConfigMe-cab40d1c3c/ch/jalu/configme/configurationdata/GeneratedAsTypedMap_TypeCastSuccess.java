package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAsTypedMap_TypeCastSuccess {

    @Test
    public void asTypedMap_TypeCastSuccess() {
        Object o = "value";
        Map<String, Object> typedMap = PropertyListBuilder.asTypedMap(o);
        assertTrue(typedMap.containsKey("value"));
    }

}