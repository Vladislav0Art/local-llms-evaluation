package ch.jalu.configme.configurationdata;

public class GeneratedTest1 {

    @Test
    public void test1() throws ConfigMeException {
        Map<String, Object> map = new LinkedHashMap<>();
        Property p1 = new Property("a", 1);
        Property p2 = new Property("b", 2);
        builder.add(p1);
        builder.add(p2);
        map.put("a", 1);
        map.put("b", 2);
    }

}