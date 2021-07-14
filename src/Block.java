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

    @Override
    public boolean equals(final Object obj){
        boolean result;
        if((obj == null) || (getClass() != obj.getClass())){
            result = false;
        } 
        else{
            Block block = (Block) obj;
            result = (this.previousHash == block.previousHash) 
            &&  this.transactions == block.transactions;
        } 
    
        return result;
    } 
    
    @Override
    public int hashCode(){
        int result = 0; 
        
        result += Arrays.hashCode(this.transactions);

        result += this.previousHash;

        return result;
    } 
}
