package org.jsoup.safety;

public class GeneratedCheckRemoveProtocolsMethod {

    @Test
    public void checkRemoveProtocolsMethod() {
        Safelist list = new Safelist();
        String[] tags = {"img"};
        for (String tag : tags) {
            list.removeProtocols(tag, "src");
        }
        Assert.assertEquals(0, list.getEnforcedAttributes("enforcer").size());
    }

}