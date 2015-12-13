package com.jacksai;

public class Individual {

    static int DEFAULT_GENE_LENGTH = 64;
    private byte[] genes = new byte[DEFAULT_GENE_LENGTH];

    //cache
    private int fitness = 0;

    public void generateRandomIndividual() {
        for(int i = 0 ; i < size(); i++) {
            byte gene = (byte) Math.round(Math.random());
            genes[i] = gene;
        }
    }

    public static void setDefaultGeneLength(int defaultGeneLength) {
        DEFAULT_GENE_LENGTH = defaultGeneLength;
    }

    public byte getGene(int index) {
        return genes[index];
    }

    public void setGene(int index, byte newGene) {
        genes[index] = newGene;
        fitness = 0 ;
    }

    public int size() {return genes.length;}

    public int getFitness() {
        if(fitness == 0) {
            fitness = FitnessCalculator.getFitness(this);
        }
        return fitness;
    }
    
    @Override
    public String toString() {
        String geneString = "";
        for(int i = 0; i < size(); i++) {
            geneString += getGene(i);
        }
        return geneString;
    }

}
