package dz1;

public class Course {

    Obstacle[] listOfObstacles = new Obstacle[3];

    public Course() {
        listOfObstacles[0] = new Obstacle("Run", 12);
        listOfObstacles[1] = new Obstacle("Jump", 3);
        listOfObstacles[2] = new Obstacle("Swim", 15);
    }

    public void justDoIt(Team team) {
        // выбираешь всех учатников команды - список участников

        for (Member member : team.listOfMembers) {
            // для каждого из них проходишь испытание
            // и начисляешь балл, если характеристика позволяет, иначе не меняешь количество баллов
            for (Obstacle obstacle : listOfObstacles) {
                if (obstacle.name.equals("Run")) {
                    if (member.maximumRunningDistance >= obstacle.value) {
                        member.addPoint();
                    }
                } else if (obstacle.name.equals("Jump")) {
                    if (member.maximumJumpHeight >= obstacle.value) {
                        member.addPoint();
                    }
                } else if (obstacle.name.equals("Swim")) {
                    if (member.maximumSwimmingDistance >= obstacle.value) {
                        member.addPoint();
                    }
                }
            }

            if (member.numberOfPoints == 3) {
                member.overcomeObstacles = true;
            }
        }

    }

}


class Obstacle {
    String name;
    int value;

    public Obstacle(String name, int value) {
        this.name = name;
        this.value = value;
    }
}