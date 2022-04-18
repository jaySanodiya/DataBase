package com.masai.EvalluationC2.Question4;

public interface Factory {
    String SizeOfNote();
}

class Size1 implements Factory {

    @Override
    public String SizeOfNote() {
        return "s1";
    }
}
class Size2 implements Factory {

    @Override
    public String SizeOfNote() {
        return "s2";
    }
}
class Size3 implements Factory {

    @Override
    public String SizeOfNote() {
        return "s3";
    }
}