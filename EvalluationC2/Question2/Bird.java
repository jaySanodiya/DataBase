package com.masai.EvalluationC2.Question2;

// Liscov’s Substitution principle is one of the solid principle.
// It is modification of Open and Close principle.
// If client is calling its method then he don't want to write unnecessory methods that's why we use Liscov’s Substitution principle



// code without Liscov’s Substitution principle

public class Bird {
    public void fly(){
        System.out.println("Fly birds");
    }
}
class Eagle extends Bird{
    // here Eagle is a Bird which can fly.
    // but Ostrich is also a bird and it cannot fly so here clint has to deal with exception
}

// code with Liscov’s Substitution principle
class LSP_Bird{}

class FlyingBirds extends LSP_Bird{
    public void fly(){
        System.out.println("Fly birds");
    }
}
class LSP_Eagle extends FlyingBirds{};

class Ostrich extends Bird{};

class Main{
    public static void main(String[] args) {
        Bird bird = new Eagle();
        bird.fly();

        FlyingBirds flyingBirds = new LSP_Eagle();
        flyingBirds.fly();

        Ostrich lsp_bird = new Ostrich();

    }
}