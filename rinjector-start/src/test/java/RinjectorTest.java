import com.epam.Smartphone;
import com.epam.Tablet;
import com.epam.configuration.Context;
import org.junit.Test;

import static org.junit.Assert.*;

public class RinjectorTest {
    private static final String config = "src/test/resources/configuration.xml";
    private Context context = new Context(config);

    @Test
    public void whenGetSmartphoneByIdFromContext_assertNotNull(){
        Smartphone smartphoneById = (Smartphone)context.getStorageById("smartphone");
        assertNotNull(smartphoneById);
    }

    @Test
    public void whenGetSmartphoneByClassName_assertCorrectClass(){
        Object smartphoneByClassName = context.getStorageByClassName("com.epam.Smartphone");
        assertTrue(smartphoneByClassName instanceof Smartphone);
    }

    @Test
    public void whenGetTabletFromContext_assertNotNull(){
        Tablet tabletById = (Tablet)context.getStorageById("tablet");
        assertNotNull(tabletById);
    }

    @Test
    public void whenGetTabletByClassName_assertCorrectClass(){
        Object tabletByClassName = context.getStorageByClassName("com.epam.Tablet");
        assertTrue(tabletByClassName instanceof Tablet);
    }

    @Test
    public void whenGetSmartphonePrice_returnCorrectValue(){
        Smartphone smartphone = (Smartphone)context.getStorageById("smartphone");
        assertEquals(1000, smartphone.getPrice());
    }

    @Test
    public void isTabletIPad_returnTrue(){
        Tablet tablet = (Tablet)context.getStorageById("tablet");
        assertTrue(tablet.isIpad());
    }

    @Test
    public void whenGetSmartphonePrice_thenReturnCorrectValue(){
        Smartphone smartphone = (Smartphone)context.getStorageById("smartphone");
        assertEquals(1000, smartphone.getPrice());
    }
}
