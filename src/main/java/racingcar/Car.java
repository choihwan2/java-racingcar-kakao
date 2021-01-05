package racingcar;

public class Car {

    private int position = 1;
    private final String name;

    public static final int STEP = 1;
    private static final int FORWARD_NUM = 4;

    public Car(String name) {
        this.name = name;
    }

    private void goFront() {
        position += STEP;
    }

    public int getPosition() {
        return position;
    }

    public int racing(int randomNum) {
        if (randomNum >= FORWARD_NUM) {
            goFront();
        }
        return getPosition();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        stb.append(name).append(" : ");
        for (int i = 0; i < position; i++) {
            stb.append("-");
        }
        return stb.toString();
    }
}