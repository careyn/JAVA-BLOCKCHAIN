package src;

import java.util.*;

public class Block {
    
    private int previousHash;
    private String[] transactions;

    private int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        int hash = Arrays.hashCode(transactions);
        
        Object[] contents = {hash, previousHash};
        this.blockHash = Arrays.hashCode(contents);
    }

    public int getPreviousHash() {
        return this.previousHash;
    }

    public String[] getTransactions() {
        return this.transactions;
    }

    public int getBlockHash() {
        return this.blockHash;
    }
}
