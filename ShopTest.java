import static org.junit.Assert.*;
import org.junit.Test;
/*
* Testing for the bugs in the resaleshop and computer.
 */


public class ShopTest {
    /*Test Computer buy
    * @throws Exception when comp is not in inventory but bought
     */

    @Test
    public void testBuy_AddNewComputer()throws Exception{
        Computer NewComputer=new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop myShop=new ResaleShop();
        myShop.buy(NewComputer);
        assertTrue(myShop.inventory.contains(NewComputer));


    }
    /*Tests buy and the throw of the exception if the comp is already in the inventory
    *@ throw Exception if comp is already in the inventory
     */
    @Test
    public void testBuy_throwExceptionIfCompExixts(){
        Computer NewComputer=new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop myShop=new ResaleShop();
        myShop.buy(NewComputer);
        assertThrows(Exception.class,()->myShop.buy(NewComputer));
    
}
/*
*Tests the Operating System
 */
@Test
    public void testSetOS(){
        Computer NewComputer=new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        assertEquals("HighSierra", NewComputer.operatingSystem);
    }
    /*
*Tests the Computer Set price
 */
@Test
    public void testconstructorSetPrice(){
        Computer NewComputer=new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        assertEquals(1000, NewComputer.price);
    }
      /*
*Tests the Computer Set price
 */
@Test
    public void testComputerComputerConstructor_setMemory(){
        Computer NewComputer=new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        assertEquals(16, NewComputer.memory);
    } 
    /*Tests sell is made
    *@ throw Exception if comp is still in the inventory
     */
@Test
    public void testsell_removeNewComputer()throws Exception{
        Computer NewComputer=new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop myShop=new ResaleShop();
        myShop.sell(NewComputer);
        assertFalse(myShop.inventory.contains(NewComputer));
    }
    /*Tests sell and the throw of the exception if the comp is not removed in the inventory
    *@ throw Exception if comp is is not removed
     */
    @Test
    public void testSell_throwExceptionIfCompNotInInventory(){
        Computer NewComputer=new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop myShop=new ResaleShop();
        myShop.sell(NewComputer);
        assertThrows(Exception.class,()->myShop.sell(NewComputer));
    
}
/*
* Testing the account on selling a computer yet the inventory is empty at all
 */
@Test
    public void testInventoryNotEmpty()throws Exception{
        Computer NewComputer=new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop myShop=new ResaleShop();
        myShop.sell(NewComputer);
        assertFalse(myShop.isEmpty());
    }
    /*
* Testing for testPrintInventoryIndexOutOfBounds based on the loop used
 */
@Test
    public void testPrintInventoryIndexOutOfBounds(){
        Computer NewComputer=new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop myShop=new ResaleShop();
        assertThrows(IndexOutOfBoundsException.class,() -> myShop.printInventory());
    }
       /*
* Testing for the OS updates
 */
   @Test
    public void testRefurbishUpdatesOS(){
        Computer NewComputer=new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        ResaleShop myShop=new ResaleShop();
        myShop.refurbish(NewComputer, "NewOS");
        assertEquals( "NewOs",NewComputer.operatingSystem );
    }

     
