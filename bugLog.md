## Bug 1
<<<<<<< HEAD
Brief description:  The constuctutor is suppossed to return the instance of the ResaleShop class which is theinventory and it is not returning anything.
Failed unit test: public ArrayList< Computer>test_ShopReturn()
=======
Brief description:  Buy method does not throw the exception when computer is not addeded but bought. Basically it does not check if the computer was sccessfully bought. 
Failed unit test: testBuy_AddNewComputer()
>>>>>>> b46d398 (Worked on the tests and the bugs they are exposing plus the java docs)

## Bug 2
Brief description: Buy method does not throw the exception if computer alredy exists in the inventory 
Failed unit test:testBuy_throwExceptionIfCompExixts() 

## Bug 3
Brief description: Sell methods in resaleshop does not throw theexception if computer is not in the inmventory 
Failed unit test: testSell_throwExceptionIfCompNotInInventory()

## Bug 4
Brief description: Set Os in computer does not set it as required 
Failed unit test: testSetOS()

## Bug 5
Brief description: The computor constructor does not update the price respective to the constructor parameters
Failed unit test:testconstructorSetPrice() 

## Bug 6
Brief description: Print inventory loop does not print all the objects in the inventory 
Failed unit test: testPrintInventoryIndexOutOfBounds()

## Bug 7
Brief description: Computer constructor does not initilize the the value given to the memory 
Failed unit test:testComputerComputerConstructor_setMemory() 

## Bug 8
Brief description:  sell method does not throw exception when computer is not removed from the inventory
Failed unit test: testsell_removeNewComputer()

## Bug 9
Brief description: The sell computer needs not only to check if the inventory is not empty at all 
Failed unit test:testInventoryNotEmpty() 

## Bug 10
Brief description: Refurbish doesn't update the OS as required
Failed unit test:testRefurbishUpdatesOS() 