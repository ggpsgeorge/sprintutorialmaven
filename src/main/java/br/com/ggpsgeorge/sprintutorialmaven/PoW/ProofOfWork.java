package br.com.ggpsgeorge.sprintutorialmaven.PoW;

public class ProofOfWork {
    public static Blockchain blockchainInit() throws Exception {
        //Blockchain init and creation of the Genesis block
        Blockchain blockchain = new Blockchain();
        Block genBlock = blockchain.getBlock();
        String hash = (Hashing.proof_of_work(genBlock));
        System.out.println(hash);
        blockchain.setBlock(genBlock);
        genBlock = blockchain.getBlock();
        blockchain.getChain().add(genBlock);

        //Insert new blocks
        int count = 0;
        String transactions = "";

        while(count < 10){
            Block block = new Block(hash, transactions);
            hash = (Hashing.proof_of_work(block));
            System.out.println(hash);
            blockchain.getChain().add(block);
            count++;
        }

        return blockchain;
       
    }
}
