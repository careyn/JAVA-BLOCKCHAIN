package test;
import junit.framework.*;
import src.Block;

public class JavaTest extends TestCase {
   protected String[] genTransactions = {"example transaction 1", "example transaction 2"};
   protected String[] twoTransactions = {"example transaction 3", "example transaction 4"};
   

   protected void setUp(){}

   // test method to add two values
   public void testDiff(){
      Block genBlock = new Block(0, genTransactions);
      Block blockTwo = new Block(genBlock.getBlockHash(), twoTransactions);
      assertFalse(genBlock.equals(blockTwo));
   }

   public void testEquivalent(){
      Block blockOne = new Block(0, genTransactions);
      Block blockTwo = new Block(0, genTransactions);
      assertTrue(blockOne.equals(blockTwo));
   }

   public void testChange(){
      Block blockOne = new Block(0, genTransactions);
      Block blockTwo = new Block(0, genTransactions);
      assertTrue(blockOne.equals(blockTwo));
      
      blockTwo = new Block(0, twoTransactions);

      assertFalse(blockOne.equals(blockTwo));

      blockTwo = new Block(blockOne.hashCode(), genTransactions);

      assertFalse(blockOne.equals(blockTwo));
   }
}

