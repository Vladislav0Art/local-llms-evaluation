package org.jsoup.nodes;

public class GeneratedGetUserData_ ReturnsUserDataForExistingKey {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void getUserData_

    ReturnsUserDataForExistingKey() {
        when(attributeMock.getKey()).thenReturn("key");
        Attributes attributes = new Attributes();
        assertEquals("user data", attributes.getUserData("key"));
    }

}