package main;

public class MockClass {

    public int ans(int ... inp){
        int sum=0;
        for (int x : inp) {
            sum+=x;
        }
        return sum;
    }
}
