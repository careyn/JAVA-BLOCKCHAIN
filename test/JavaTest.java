package test;
import junit.framework.*;
import src.Block;

public class JavaTest extends TestCase {
   protected String[] genTransactions = {"example transaction 1", "example transaction 2"};
   protected String[] twoTransactions = {"example transaction 3", "example transaction 4"};
   
   // assigning the values
   protected void setUp(){
   }

   // test method to add two values
   public void testAdd(){
      Block genBlock = new Block(0, genTransactions);
      Block blockTwo = new Block(genBlock.getBlockHash(), twoTransactions);
      assertTrue(genBlock != blockTwo);
   }
}