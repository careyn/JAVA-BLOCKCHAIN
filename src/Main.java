package src;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // String[] list = {"1","2","3","4","5"};

        // System.out.println(Arrays.hashCode(list));

        String[] genTransactions = {"example transaction 1", "example transaction 2"};
        Block genBlock = new Block(0, genTransactions);

        String[] twoTransactions = {"example transaction 3", "example transaction 4"};
        Block blockTwo = new Block( genBlock.getBlockHash(), twoTransactions);

        System.out.println("Genesis block hash:" +  genBlock.getBlockHash());
        System.out.println("Second block hash" +  blockTwo.getBlockHash());

        int[] blockchain= {genBlock.getBlockHash(), blockTwo.getBlockHash()};

        System.out.println(Arrays.hashCode(blockchain));
    }
}