import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class ShopTest {

    // add your tests here 
    @Test
    /**
     * Constructor
     *
     * @return an instance of ResaleShop
     */
    

    

    @Test
    /* This computer should have all the key attributes registered in */
    public void test_computerDiscription() {
        ResaleShop ResaleShop = new ResaleShop();
        Computer newComputer = new Computer("2020 MacBookAir Retina", "Intel", 256, 16, "Sonoma", 2019, 1000);
        assertEquals("2020 MacBookAir Retina", newComputer.description);
    }

    @Test
    public void test_computerProcessorType() {
        ResaleShop ResaleShop = new ResaleShop();
        Computer newComputer = new Computer("2020 MacBookAir Retina", "Intel", 256, 16, "Sonoma", 2019, 1000);
        assertEquals("Intel", newComputer.processorType);
    }

    @Test
    public void test_computerhardDriveCapacity() {
        ResaleShop ResaleShop = new ResaleShop();
        Computer newComputer = new Computer("2020 MacBookAir Retina", "Intel", 256, 16, "Sonoma", 2019, 1000);
        assertEquals(256, newComputer.hardDriveCapacity);
    }

    @Test
    public void test_computerMemory(){
        ResaleShop ResaleShop = new ResaleShop();
        Computer newComputer = new Computer("2020 MacBookAir Retina", "Intel", 256, 16, "Sonoma", 2019, 1000);
        assertEquals(16, newComputer.memory);
    }

    @Test
    public void test_computerOperatingSystem(){
        ResaleShop ResaleShop = new ResaleShop();
        Computer newComputer = new Computer("2020 MacBookAir Retina", "Intel", 256, 16, "Sonoma", 2019, 1000);
        assertEquals("Sonoma", newComputer.operatingSystem);
    }
    @Test
    public void test_exceptionTrow(){
        ResaleShop ResaleShop = new ResaleShop();
        Computer newComputer = new Computer("2020 MacBookAir Retina", "Intel", 256, 16, "Sonoma", 2019, 1000);
        
        try {
            ResaleShop.inventory.add(newComputer);
            if (ResaleShop.inventory.size() > 1 ){
                throw new Exception("Computer already in inventory");
            }

        } catch (Exception e) {
            assertEquals("Computer already in inventory", e.getMessage());
            }
    }

    public void test_computerSell() {
        ;
        
        }


    }

    public void test_inventoryPrint() {

    }

    public void test_refurbished() {

    }

    public void test_newOs() {

    }

    public static void main(String[] args) {

    }

}
