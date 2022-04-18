package com.masai.EvalluationC2.Question3;

// In this example "Interface Segrigation Principle" is voilated.
// here is the modification of the given code

public interface DataManager {
    void read();
}

interface DataManagerReadAndWrite extends DataManager{
    void read();
    void write();
}

class DiscRealmManager implements DataManagerReadAndWrite{

    @Override
    public void read() {
        System.out.println("Reading DiscRealmManager");
    }

    @Override
    public void write() {
        System.out.println("Writing DiscRealmManager");
    }
}

class DiscCoreManager implements DataManagerReadAndWrite{

    @Override
    public void read() {
        System.out.println("Reading DiscCoreManager");
    }

    @Override
    public void write() {
        System.out.println("Writing DiscCoreManager");
    }
}

class InMemoryRealmManager implements DataManager{

    @Override
    public void read() {
        System.out.println("Reading InMemoryRealmManager");
    }

}
