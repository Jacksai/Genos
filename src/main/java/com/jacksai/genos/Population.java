package com.jacksai.genos;

public class Population {

    Individual[] individuals;

    public Population(int populationSize, boolean initialize) {
        individuals = new Individual[populationSize];
        if(initialize) {
            for(int i = 0 ; i < size(); i++ ) {
                Individual newIndividual = new Individual();
                newIndividual.generateRandomIndividual();
                saveIndividual(i, newIndividual);
            }
        }
    }

    /* Getters */
    public Individual getIndividual(int index) {
        return individuals[index];
    }
    public Individual getFittest() {
        Individual fittest = individuals[0];
        // Loop through individuals to find fittest
        for (int i = 0; i < size(); i++) {
            if (fittest.getFitness() <= getIndividual(i).getFitness()) {
                fittest = getIndividual(i);
            }
        }
        return fittest;
    }

    /* Public methods */
    // Get population size
    public int size() {
        return individuals.length;
    }

    // Save individual
    public void saveIndividual(int index, Individual indiv) {
        individuals[index] = indiv;
    }
}

