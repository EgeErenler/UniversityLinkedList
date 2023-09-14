package university;

import java.util.Scanner;

public class Interface {
    static Tree compTree;
    static Tree softTree;
    static Tree itTree;
    void welcome() {
        inputData();
        System.out.println("Welcome to the university preference panel!\n");

        while (true) {
            String departmentChoice = departmentSelection();

            switch (departmentChoice) {
                case "1" -> printPreferences(compTree);
                case "2" -> printPreferences(softTree);
                case "3" -> printPreferences(itTree);
                case "4" -> System.exit(0);
            }
        }
    }

    static void inputData() {
        compTree = new Tree();
        softTree = new Tree();
        itTree = new Tree();

        String[] compUni = new String[]{"Koç Üniversitesi", "Bahçeşehir Üniversitesi", "Gebze Teknik Üniversitesi", "Ankara Üniversitesi", "Dokuz Eylül Üniversitesi"};
        String[] compScores = new String[]{"525,61", "476,33", "441,24", "433,78", "423,55"};
        String[] compFacilities = new String[]{"Gym, Library, Lab", "Gym, Library, Lab", "Gym, Library", "Library, Lab", "Gym, Library"};
        String[] compCities = new String[]{"İstanbul", "İstanbul", "Kocaeli", "Ankara", "İzmir"};

        String[] softUni = new String[]{"Bahçeşehir Üniversitesi", "İzmir Ekonomi Üniversitesi", "Türk Hava Kurumu Üniversitesi", "Sakarya Üniversitesi", "Hasan Kalyoncu Üniversitesi"};
        String[] softScores = new String[]{"464,18", "436,45", "385,28", "382,82", "372,34"};
        String[] softFacilities = new String[]{"Gym, Library, Lab", "Gym, Library, Lab", "Gym, Library", "Library, Lab", "Gym, Library"};
        String[] softCities = new String[]{"İstanbul", "İzmir", "Ankara", "Sakarya", "Gaziantep"};

        String[] itUni = new String[]{"Bilkent Üniversitesi", "Yeditepe Üniversitesi", "İstanbul Okan Üniversitesi", "Trakya Üniversitesi", "Atatürk Üniversitesi"};
        String[] itScores = new String[]{"429,82", "379,75", "312,15", "236,69", "224,31"};
        String[] itFacilities = new String[]{"Gym, Library, Lab", "Gym, Library, Lab", "Gym, Library", "Library, Lab", "Gym, Library"};
        String[] itCities = new String[]{"İstanbul", "İstanbul", "İstanbul", "Edirne", "Erzurum"};

        for (int i = 0; i < 5; i++) {
            LinkedList compList = new LinkedList();
            LinkedList softList = new LinkedList();
            LinkedList itList = new LinkedList();

            compList.insert(compUni[i]);
            compList.insert(compScores[i]);
            compList.insert(compFacilities[i]);
            compList.insert(compCities[i]);

            softList.insert(softUni[i]);
            softList.insert(softScores[i]);
            softList.insert(softFacilities[i]);
            softList.insert(softCities[i]);

            itList.insert(itUni[i]);
            itList.insert(itScores[i]);
            itList.insert(itFacilities[i]);
            itList.insert(itCities[i]);

            compTree.insert(compList);
            softTree.insert(softList);
            itTree.insert(itList);
        }


    }

    static void printPreferences(Tree universityTree) {
        universityTree.printAll();
    }

    static String departmentSelection() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which department are you willing to study?");
        System.out.println("1. Computer Engineering\n" +
                "2. Software Engineering\n" +
                "3. Information Systems and Technologies\n" +
                "4. Exit");

        return scanner.nextLine();
    }
}
