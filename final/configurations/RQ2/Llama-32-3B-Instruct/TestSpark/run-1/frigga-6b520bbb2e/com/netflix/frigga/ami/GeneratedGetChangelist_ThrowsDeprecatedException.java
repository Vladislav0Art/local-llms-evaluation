package com.netflix.frigga.ami;

public class GeneratedGetChangelist_ThrowsDeprecatedException {

    @Test
    public void getChangelist_ThrowsDeprecatedException() {
        // Arrange

        // Act and Assert
        assertThrows(NullPointerException.class, () -> AppVersion.getChangelist());
    }

}