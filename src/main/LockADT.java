package main;

public interface LockADT {
    void setX(int x);
    void setY(int y);
    void setZ(int z);

    void alter(int x, int y, int z);

    void turn();

    void close();

    void attempt();

    boolean inquire(boolean a, boolean b, boolean c);

    int current();
}
