package dz1;

public class Member {
    String name;
    Boolean overcomeObstacles;
    int maximumRunningDistance;
    int maximumJumpHeight;
    int maximumSwimmingDistance;
    int numberOfPoints;


    public Member(String name, int maximumRunningDistance, int maximumJumpHeight, int maximumSwimmingDistance){
        this.name = name;
        this.overcomeObstacles = false;
        this.maximumRunningDistance = maximumRunningDistance;
        this.maximumJumpHeight = maximumJumpHeight;
        this.maximumSwimmingDistance = maximumSwimmingDistance;
        this.numberOfPoints = 0;
    }

    public void addPoint(){
        numberOfPoints = numberOfPoints +1;
    }

    public String toStringInfo() {
        String info = "Имя = " + name + ", "
                + "Прошел испытание? = " + overcomeObstacles + ", "
                + "Максимальная дистанция бега = " + maximumRunningDistance + ", "
                + "максимальная высота прыжка = " + maximumJumpHeight + ", "
                + "максимальная дистанция плавания = " + maximumSwimmingDistance + ", "
                + "количество баллов, полученных на полосе препятствий = " + numberOfPoints;
        return info;
    }

}
