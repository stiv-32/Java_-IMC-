package com.example;

public class IMC {
        public Object person;
        private double imc;
        private String state;

        public IMC(Person person){
        this.person = person;
        imc = person.weight / Math.pow(person.height,2);
        }

        public void setPersonState() {
        
        if (this.imc < 16){
        this.state = "Delgadez Severa";
        System.out.println("El IMC de la persona: " + this.state);
        }
        
       if (this.imc >= 16 && this.imc < 17) {
        this.state = "Delgadez Moderada";
        System.out.println("Estado de la persona: " + this.state);
       }

       if (this.imc >= 17 && this.imc < 18.5) {
        this.state = "Delgadez Leve";
        System.out.println("Estado de la persona: " + this.state);
       }

       if (this.imc >= 18.5 && this.imc <25){
       this.state = "Peso Normal";
       System.out.println("Estado de la persona: " + this.state);
       }
        
       if (this.imc >= 25 && this.imc <30) {
       this.state = "Sobrepeso";
       System.out.println("Estado de la persona: " + this.state);
       }

       if (this.imc >= 30 && this.imc < 35) {
       this.state = "Obesidad Leve";
       System.out.println("Estado de la persona: " + this.state);
       }

       if (this.imc >= 30 && this.imc < 40) {
       this.state = "Obesidad Moderada";
       System.out.println("Estado de la persona: " + this.state);
       }

       if (this.imc >= 40) {
       this.state = "Obesidad Mordidad";
       System.out.println("Estado de la persona: " + this.state);
       }
    }
}


