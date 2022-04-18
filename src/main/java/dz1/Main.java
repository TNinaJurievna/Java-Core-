package dz1;

public class Main {

    public static void main(String[] args) {
        Member memberBob = new Member("Bob", 10, 3, 15);
        Member memberZak = new Member("Zak", 12, 4, 16);
        Member memberLeo = new Member("Leo", 9, 2, 17);
        Member memberBil = new Member("Bil", 13, 1, 15);

        Team team = new Team("Dream", memberBob, memberZak, memberLeo, memberBil);


        Course course = new Course();
        course.justDoIt(team);
        System.out.println("Информации о тех, кто прошел испытание:");

        team.showWinnersInfo();
        System.out.println("");

        System.out.println("Информации обо всех членах команды:");

        team.showTeammatesInfo();

    }
}