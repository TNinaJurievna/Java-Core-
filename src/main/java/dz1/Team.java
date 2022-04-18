package dz1;

public class Team {
    String name;
    Member[] listOfMembers = new Member[4];

    //конструктор
    public Team(String name, Member member0, Member member1, Member member2, Member member3) {
        this.name = name;
        listOfMembers[0] = member0;
        listOfMembers[1] = member1;
        listOfMembers[2] = member2;
        listOfMembers[3] = member3;
    }


    /**
     * метод для вывода информации о членах команды, прошедших дистанцию;
     */
    public void showWinnersInfo() {
        // берем всех членов команды и если кто-то прошел, то выводим инфу (прошел по количеству баллов - не менее 3)
        for (Member item : listOfMembers) {
            if (item.numberOfPoints == 3) {
                System.out.println(item.toStringInfo());
            }
        }

    }

    /**
     * метод вывода информации обо всех членах команды
     */
    public void showTeammatesInfo() {
        // берем всех членов команды выводим инфу
        for (Member item : listOfMembers) {
            System.out.println(item.toStringInfo());
        }
    }
}
