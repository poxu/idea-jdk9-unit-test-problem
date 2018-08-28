package com.demo;

import com.demo.visible.SoftwareProduct;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class ApplicationTest {
    /*
    library/src/main/java/module-info.java file has the following inside
    provides SoftwareProduct with SoftwareProductImpl;

    That should allow java service locator find implementation for SoftwareProduct
    And it does find it if I run my Application
    If I do that same with unit tests it doesn't
     */
    @Test
    public void providesDirectiveIsIgnored() {
        SoftwareProduct product = Application.findSoftware();
        assertNotNull(product);
        assertEquals("1.2.3",product.getVersion());
    }


}
