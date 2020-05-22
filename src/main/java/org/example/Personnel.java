package org.example;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public final class Personnel implements Composite , Serializable {
    /**
     *
     */
    private final String nom;
    /**
     *
     */
    private final String prenom;
    /**
     *
     */
    private final String fonction;
    /**
     *
     */
    private final LocalDateTime naissance;
    /**
     *
     */
    private final ArrayList<String> telephone;

    /**
     *
     * @param builder
     */
    private Personnel(Builder builder) {
        //Required
        nom = builder.nom;
        prenom = builder.prenom;

        //Optional
        naissance = builder.naissance;
        telephone =new ArrayList<String>();
        fonction = builder.fonction;
    }

    /**
     *
     */
    @Override
    public void print() {
        System.out.println("Nom " + this.nom);
    }

    /**
     *
     */
    public static class Builder {
        //Required
        /**
         *
         */
        private final String nom;
        /**
         *
         */
        private final String prenom;

        //Optional
        /**
         *
         */
        private LocalDateTime currentTime = LocalDateTime.now();
        /**
         *
         */
        private LocalDateTime naissance = currentTime.withDayOfMonth(1).withYear(1990).withMonth(1);
        /**
         *
         */
        private ArrayList<String> telephone = new ArrayList<String>();
        /**
         *
         */
        private String fonction;

        /**
         *
         * @param nom
         * @param prenom
         */
        public Builder(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        /**
         * Mettre a jour sa date de naissance
         * @param naissance
         * @return Builder
         */
        public Builder naissance(LocalDateTime naissance) {
            naissance = naissance;
            return this;
        }

        /**
         *Mettre a jour son telephone
         * @param phone
         * @return Builder
         */
        public Builder telephone(String phone) {
            this.telephone.add(phone);
            return this;
        }

        /**
         *Mettre a jour la fonction qu'il occupe
         * @param fonction
         * @return
         */
        public Builder fonction(String fonction) {
            this.fonction = fonction;
            return this;
        }

        /**
         * Creation de Personnel
         * @return Personnel
         */
        public Personnel build() {
            return new Personnel(this);
        }

    }

}